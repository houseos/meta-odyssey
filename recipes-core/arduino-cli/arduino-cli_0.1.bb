inherit dpkg-raw

DESCRIPTION = "Arduino CLI"
MAINTAINER = "Benjamin Schilling <benjamin.schilling33@gmail.com>"
DEBIAN_DEPENDS = "ca-certificates, dnsutils"

SRC_URI = "https://github.com/arduino/arduino-cli/releases/download/0.20.2/arduino-cli_0.20.2_Linux_64bit.tar.gz \
            file://arduino-cli.yaml \
            file://postinst"

SRC_URI[sha256sum] = "86f717b7d14e2aa922afcf40f19d12b7f680892589020c54c0637b057f5d4add"

do_install() {
    install -v -d ${D}/opt/arduino-cli/
    install -v -m 644 ${WORKDIR}/arduino-cli.yaml /${D}/opt/arduino-cli
    install -v -m 755 ${WORKDIR}/arduino-cli /${D}/opt/arduino-cli
}