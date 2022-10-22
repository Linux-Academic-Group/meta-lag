SUMMARY = "SL (Steam Locomotive)"
DESCRIPTION = "SL(1): Cure your bad habit of mistyping"

SRC_URI = " \
    git://github.com/mtoyoda/sl.git;branch=master;protocol=https \
    file://0001-Make-flags-undefined.patch \
    "
SRCREV = "923e7d7ebc5c1f009755bdeb789ac25658ccce03"
LICENSE = "mToyoda"
LIC_FILES_CHKSUM = "file://LICENSE;md5=74e9dd589a0ab212a9002b15ef2b82f0"

inherit cmake

S = "${WORKDIR}/git"

DEPENDS += " \
    ncurses \
"
do_configure() {
    cd ${S}
}

do_compile() {
    cd ${S}
    oe_runmake
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/sl ${D}${bindir}
}

FILES:${PN} += "${bindir}/sl"
