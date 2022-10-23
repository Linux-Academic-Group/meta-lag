SUMMARY = "Neo Cowsay"
DESCRIPTION = "Neo Cowsay is written in Go. This cowsay is extended the original cowsay. added fun more options, and you can be used as a library."

SRC_URI = " \
    git://github.com/Code-Hex/Neo-cowsay.git;branch=master;protocol=https;destsuffix=git \
"
SRCREV = "eb0e41e201ae24a73cb999bf28a24b891347900e"
LICENSE = "Artistic-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8b8442b466344f5ad13a0c80473a1de5"

inherit go pkgconfig

S = "${WORKDIR}/git"
B = "${WORKDIR}/build"

FILES:${PN} += " \
    ${bindir}/cowsay \
    ${bindir}/cowthink \
"

do_configure:append () {
    if [ -h ${B}/src ]; then
        rm ${B}/src
    fi
    ln -snf ${S} ${B}
}

do_compile() {
    GOPATH="${B}:${S}"
    export GOPATH
    PATH="${B}/bin:$PATH"
    export PATH
    cd ${B}/git
    oe_runmake V=1
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/bin/cowsay ${D}${bindir}
    install -m 0755 ${S}/bin/cowthink ${D}${bindir}
}

do_rm_work:prepend() {
    if [ -d ${B}/pkg ]; then
        cd ${B}/pkg/mod
        find . -exec chmod u+w {} \;
    fi
}

INSANE_SKIP:${PN} = "already-stripped"
