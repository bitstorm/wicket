#!/bin/bash
echo -n "Reverting release 7.17.0

Actions about to be performed:
------------------------------

$(cat $0 | tail -n +14)

------------------------------------------
Press enter to continue or CTRL-C to abort"

read

# clean up local repository
git checkout wicket-7.x
git branch -D build/wicket-7.17.0
git tag -d rel/wicket-7.17.0

# clean up staging repository
git push staging --delete refs/heads/build/wicket-7.17.0
git push staging --delete rel/wicket-7.17.0

# clean up staging dist area
svn rm https://dist.apache.org/repos/dist/dev/wicket/7.17.0 -m "Release vote has failed"

# clean up staging maven repository
mvn org.sonatype.plugins:nexus-staging-maven-plugin:LATEST:rc-drop -DstagingRepositoryId= -DnexusUrl=https://repository.apache.org -DserverId=apache.releases.https -Ddescription="Release vote has failed"

# clean up remaining release files
find . -name "*.releaseBackup" -exec rm {} ;
[ -f release.properties ] && rm release.properties
