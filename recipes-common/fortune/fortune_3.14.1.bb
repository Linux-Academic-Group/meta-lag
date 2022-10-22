SUMMARY = "Fortune - print a random, hopefully interesing, adagae"
DESCRIPTION = "Fortune: motivate yourself with a random epigram"

SRC_URI = " \
    git://github.com/shlomif/fortune-mod;branch=main;protocol=https \
    "

SRCREV = "f7db85d1d7efec84f67bf59ccd9ed2d265cf3217"
LICENSE = "UoC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1a69b18effea0b6ec07ece35fc43d74"

inherit cmake

S = "${WORKDIR}/git"

DEPENDS += " \
    recode \
    make \
    cmake \
    glibc \
"

do_install() {
    install -d ${D}${bindir}
    install -m 755 ${S}/fortune-mod/build/fortune-mod ${D}${bindir}
}

FILES:${PN} += "${bindir}/fortune-mod"
