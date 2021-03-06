DESCRIPTION = "Clean single-source support for Python 3 and 2"
HOMEPAGE = "https://python-future.org"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3f457538b297bd0ef86564b8ac216ad7"
DEPENDS = "python python-pip"

SRC_URI = "https://pypi.python.org/packages/00/2b/8d082ddfed935f3608cc61140df6dcbf0edea1bc3ab52fb6c29ae3e81e85/future-0.16.0.tar.gz"
SRC_URI[md5sum] = "3e8e88a2bda48d54b1da7634d04760d7"
SRC_URI[sha256sum] = "e39ced1ab767b5936646cedba8bcce582398233d6a627067d4c6a454c90cfedb"
S = "${WORKDIR}/future-${PV}"

inherit setuptools

BBCLASSEXTEND = "native"
