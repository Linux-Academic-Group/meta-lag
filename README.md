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
