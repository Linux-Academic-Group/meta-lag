SUMMARY = "Asciiquarium perl script"
DESCRIPTION = "Asciiquarium - enjoy the mysteries of the sea from the safety of your own terminal!"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://gpl.txt;md5=393a5ca445f6965873eca0259a17f833"

SRC_URI = " \
    git://github.com/cmatsuoka/asciiquarium;branch=master;protocol=https;destsuffix=git \
"
SRCREV = "8bdb7d441a36a5a9f64b853317a66f9d4a82f08f"

S = "${WORKDIR}/git"

FIMES:${PN} += " \
    ${bindir}/asciiquarium \
"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/asciiquarium ${D}${bindir}
}

RDEPENDS_${PN} += "term-animation curses"
