SUMMARY = "CMatrix"
DESCRIPTION = "CMatrix shows text flying in and out in a terminal like as seen in "The Matrix" movie"

SRC_URI = " \
    git://github.com/abishekvashok/cmatrix.git;branch=stable;protocol=https \
    file://0001-Remove-symbols-check.patch \
"
SRCREV = "adfdf1656f23e5ab3b52c7d7edf91249a4477e8d"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

inherit autotools

S = "${WORKDIR}/git"

DEPENDS += " \
    ncurses \
"

FILES:${PN} += "${bindir}/cmatrix"
