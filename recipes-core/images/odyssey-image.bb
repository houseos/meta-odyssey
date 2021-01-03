inherit image

ISAR_RELEASE_CMD = "git -C ${LAYERDIR_cip-core} describe --tags --dirty --always --match 'v[0-9].[0-9]*'"
DESCRIPTION = "Image for SEEED Studio Odyssey x86 SBC"

require basic-config.inc