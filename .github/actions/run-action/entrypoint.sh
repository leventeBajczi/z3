#!/bin/bash
RUN mkdir release
RUN python2.7 scripts/mk_make.py --prefix=$PWD/release --java
RUN cd build/ && make -j $(nproc)
