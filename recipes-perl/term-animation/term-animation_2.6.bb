SUMMARY = "Term Animation library for perl"
SECTION = "libs"
HOMEPAGE = "http://search.cpan.org/dist/Term::Animation/"
DESCRIPTION = "Term::Animation - ASCII sprite animation framework"
LICENSE = "GPL-1.0"
LIC_FILES_CHKSUM = "file://README;beginline=28;endline=31;md5=64f233d98b569563b6a7931bcc9f99f1"

SRC_URI = " \
    https://cpan.metacpan.org/authors/id/K/KB/KBAUCOM/Term-Animation-2.6.tar.gz \
"
SRC_URI[sha256sum] = "7d5c3c2d4f9b657a8b1dce7f5e2cbbe02ada2e97c72f3a0304bf3c99d084b045"

S = "${WORKDIR}/Term-Animation-2.6"

inherit cpan ptest-perl
