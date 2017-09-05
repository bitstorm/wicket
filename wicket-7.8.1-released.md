---
layout: post
title: Apache Wicket 7.8.1 released
---
The Apache Wicket PMC is proud to announce Apache Wicket 7.8.1!

Apache Wicket is an open source Java component oriented web application
framework that powers thousands of web applications and web sites for
governments, stores, universities, cities, banks, email providers, and
more. You can find more about Apache Wicket at https://wicket.apache.org

This release marks another minor release of Wicket 7. We
use semantic versioning for the development of Wicket, and as such no
API breaks are present breaks are present in this release compared to
7.0.0.

<OPTIONAL> New and noteworthy
<OPTIONAL> ------------------
<OPTIONAL>
Using this release
------------------

With Apache Maven update your dependency to (and don't forget to
update any other dependencies on Wicket projects to the same version):

{% highlight xml%}
<dependency>
    <groupId>org.apache.wicket</groupId>
    <artifactId>wicket-core</artifactId>
    <version>7.8.1</version>
</dependency>
{% endhighlight%}

Or download and build the distribution yourself, or use our
convenience binary package

 * Source: [7.8.1 source download](http://www.apache.org/dyn/closer.cgi/wicket/7.8.1)
 * Binary: [7.8.1 binary download](http://www.apache.org/dyn/closer.cgi/wicket/7.8.1/binaries)

<!--more-->

Upgrading from earlier versions
-------------------------------

If you upgrade from 7.y.z this release is a drop in replacement. If
you come from a version prior to 7.0.0, please read our Wicket 7
migration guide found at

 * http://s.apache.org/wicket7migrate

Have fun!

— The Wicket team


========================================================================

    The signatures for the source release artefacts:

    
Signature for apache-wicket-7.8.1.zip:

<div class='highlight'><pre>
-----BEGIN PGP SIGNATURE-----
Version: GnuPG v1

iQIcBAABAgAGBQJZrwPJAAoJEAzCjx+CMhBVibwQAIzHKnHWsIaKG9xHS1DzvtL5
quCvZALeEn/wYQ0xoqXkd9L2hZyMyMzbSX5TUZvYC1ZpLDQJLFuhLg4Lgs76iv79
XKgRTGLkepjTqwlqp89xFkuDNy/ezzEHei5VoTIMgxYx+CnbF9T/Dc+ZVrg9zScj
AlK9AYEF6+WKdH8Hf9vP8LNmLoJ5pwbiICF6wkDV5Yikl3d6dMK3nsvCUzyv2qFp
TEqu8xocTokApFiHRXhIZ6Jnov+z1O3O3kbptt52T39oVYl8IPLPMHHYpMvfqOO3
2cMelm2qCg0foQLRvH9N2ViTdb9B2TAaGmqckRGXziwG2Sa3qQJfxw30YieXGr/u
/FydqxMu/QfMc9w7DhRwyK/0ShoYOaslvJIpCks/Fcs81cVU8Vy8+aXxL+6vVyxO
IkRlD4F1uwlAw3WXszBGDsOQSSMiwcP5za5BpzA6pSwm9NLerJpDs/XdAUgsaKfH
IA/3iHCqvPhOj+qTx6l9UKY1MK2uSgrIHTnmfCqUvsWrPKEJOCe+tzIJq1F0FtoJ
kBOagJUpywx0XMfJJbzgfsp+j8eaJhOzv6hBVsgcchZhjARtl407Q5gKVMwP3vTT
LHkSCwUwVFyHW+3gXAJJQJihCTvLN8jlL1qrl9+JOCtVl6wnkFsCSb+if8MAaJEf
gE1AAJeFPnXO6wzqhFSG
=oi5Z
-----END PGP SIGNATURE-----
</pre></div>

    
Signature for apache-wicket-7.8.1.tar.gz:

<div class='highlight'><pre>
-----BEGIN PGP SIGNATURE-----
Version: GnuPG v1

iQIcBAABAgAGBQJZrwPJAAoJEAzCjx+CMhBVr8QQAJGq6TWnRE+/5LIpMxbGi42S
2WGJF+1CaEmOAyaqVjhoOvHsbWCSx5IGR8vN6UUrWQPXbb0Nn6mulDSKL+YIhrmm
pvi2wS5pn/wmP9w7n4PaUAxFF8Htgky9wzjeX/SHrePWrSZPTCDV57m5fVGBckve
zM3ZWPuwZJ2wddMkoDWbTPZj08AMl3h+503leuVy7V50OoWNjYs+t09uiult2qTe
5mBqIDEKJBZoNYRXC0vkyYxsTAbWy9a1RqcaEcf1pprNMvLX1iwmPdTvKfnoVs4V
gBrWuNw2tr65qs2ZkC+VfosFe5hoGqV/DVKRjDcA2SXf23P43b1BqU82JKJw/nYC
YfSRSP4IFpuLMl0libknx5VV0sSv6/xTjju2/1BoInho16IhW8MK/vR12Xef4CSy
3l8tBAB5X+3zOKcQoruA9DY50Fatt49knH867fvNqa35P/AYDSDneSGf7ejYje0x
ggcKEBa8O4JEHpSQuQfM+PdYoTetM2Kq6zCGjDUJjU8ViS14Nfoy9RU194c/EXmO
K3zrdSPdNnzJbVFP+2D1SsQQ0vaJfOiVkVroC1pCpxAZJvXawjIO3FYWM+zzE1Mb
S3Ey2GHhmovALGg5i7UR6/3OCz84wKRTMwxKgHwX4fFOtW/eh7q/M+lU130YqHe3
t1PPdPAfi4Wd2UxzCizo
=lEbE
-----END PGP SIGNATURE-----
</pre></div>

    
========================================================================

### This Release

#### CHANGELOG for 7.8.1:
    

##### Bug

 * [WICKET-6457] - PageStore not cleared at session end

Release Notes - Wicket - Version 7.8.0

##### Bug

 * [WICKET-4324] - [wicket-ioc] LazyInitProxyFactory CGLIB proxies naming strategy may cause java.lang.IllegalAccessError
 * [WICKET-6362] - HeaderItems with different PageParameters are treated as identical
 * [WICKET-6366] - Autocomplete race condition makes page unresponsive
 * [WICKET-6373] - Edge not recognized in UserAgent
 * [WICKET-6374] - Exception caused by border extending another border with <wicket:extend>
 * [WICKET-6376] - Ajax redirects to non http(s)-urls are interpreted as relative
 * [WICKET-6377] - Autolinking breaks hierarchy for nested elements
 * [WICKET-6386] - Simplification of the code in WICKET-3347 is not consistent with previous behavior
 * [WICKET-6387] - ModalWindow PageReference broken
 * [WICKET-6393] - NestedStringResourceLoader ignores hard-coded default values and throws MissingResourceException
 * [WICKET-6398] - WICKET-6204 breaks jQuery.noConflict()
 * [WICKET-6399] - Dequeuing of Border component with nested body fails
 * [WICKET-6400] - Object with array property fails on NPE when construction JSON object

##### Improvement

 * [WICKET-6372] - Consider to switch to a sans-serif typeface in the Wicket guide
 * [WICKET-6385] - Allow using custom port for web socket connections
 * [WICKET-6389] - Introduce CsrfPreventionRequestCycleListener that is aware of Web Socket requests
 * [WICKET-6401] - OSGi-Manifest: wicket-util should decalre its dependency to 'commons-io' and 'commons-fileupload'

##### Task

 * [WICKET-6391] - Deprecate the classes and methods which now throw runtime exception after the switch to OpenJson

