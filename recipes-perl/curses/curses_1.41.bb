SUMMARY = "Curses library for perl"
SECTION = "libs"
HOMEPAGE = "http://search.cpan.org/dist/Curses/"
DESCRIPTION = "Curses - terminal screen handling and optimization"
LICENSE = "GPL-1.0"
LIC_FILES_CHKSUM = "file://README;beginline=109;endline=131;md5=611bc93ea98f6d0b2a3c74ea88d15800"

SRC_URI = " \
    https://cpan.metacpan.org/authors/id/G/GI/GIRAFFED/Curses-1.41.tar.gz \
"
SRC_URI[sha256sum] = "fb9efea8c7b5ed5f8ea5dee49d35252accfc05ee6e75cb9a37ab7c847cd261d7"

S = "${WORKDIR}/Curses-1.41"

inherit cpan ptest-perl
