
# Tools required for ethernet access
IMAGE_INSTALL += "eth-config"
IMAGE_PREINSTALL += "iproute2 iputils-ping wget dnsutils ca-certificates"

# Editor
IMAGE_PREINSTALL += "nano"

# Tools required for ATSAMD21G18 Co-Processor
IMAGE_INSTALL += "arduino-cli"

# swupdate integration
SWU_DESCRIPTION ??= "swupdate"
require recipes-core/images/${SWU_DESCRIPTION}.inc