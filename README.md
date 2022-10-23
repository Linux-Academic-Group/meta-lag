# Meta-LAG
## Initialize repo
```
mkdir build-lag && cd build-lag
repo init -u ssh://git@github.com/Linux-Academic-Group/meta-lag.git -m system-releases/unmatched-basic/manifest.xml
repo sync -j`nproc`
```
## Setup building environment
We expect you have [yoctobuilder]() image installed.
```
sudo docker run --rm -v $PWD:/data -u $(id -u):$(id -u) -it yoctobuilder``
cd data/
source sources/poky/oe-init-build-env
```
## Build an image
```
PARALLEL_MAKE="-j $(nproc)" BB_NUMBER_THREADS="$(nproc)" MACHINE="unmatched" bitbake core-image-fun
```
## Writing built image to SD card
The `sdX` argument should be changed to corresponding disk partition.
```
cd build/tmp/deploy/images/unmatched/
xzcat core-image-minimal-unmatched.wic.xz | sudo dd of=/dev/sdX bs=512K iflag=fullblock oflag=direct conv=fsync status=progress
```
