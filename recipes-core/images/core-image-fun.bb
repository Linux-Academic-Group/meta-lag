SUMMARY = "Core image for fun"
DESCRIPTION = "A core image containing recipes fun recipes"

inherit core-image

LICENSE = "Apache2.0"

IMAGE_INSTALL += " \
    sl \
    cmatrix \
    cowsay \
    asciiquarium \
"
