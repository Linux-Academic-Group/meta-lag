# This is a copy of original recipe from:
# https://github.com/sifive/freedom-u-sdk/blob/2210dddad72226e489b0c7315fae78b6205d7238/recipes-core/initrdscripts/initramfs-framework_1.0.bbappend
FILESEXTRAPATHS:prepend := "${THISDIR}/initramfs-framework:"

SRC_URI += " \
           file://nbdrootfs \
          "

do_install:append() {

    # base
    install -m 0755 ${WORKDIR}/nbdrootfs ${D}/init.d/86-nbdrootfs
}

PACKAGES += " \
            initramfs-module-nbdrootfs \
           "


SUMMARY:initramfs-module-nbdrootfs = "initramfs support for locating and mounting the root partition via nbd"
RDEPENDS:initramfs-module-nbdrootfs = "${PN}-base"
FILES:initramfs-module-nbdrootfs = "/init.d/86-nbdrootfs"
