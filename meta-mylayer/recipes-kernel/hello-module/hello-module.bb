DESCRIPTION = "Módulo Hola Mundo para el kernel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://hello.c;beginline=1;endline=10;md5=f4c4c4c05cabf895866576f757ddcee6"


SRC_URI = "file://hello.c \
           file://Makefile"

inherit module

S = "${WORKDIR}"

