#!/bin/bash
mkdir release
python2.7 scripts/mk_make.py --prefix=$PWD/release --java
cd build/ && make -j $(nproc)
