inherit image
#inherit image_uuid

ISAR_RELEASE_CMD = "git -C ${LAYERDIR_cip-core} describe --tags --dirty --always --match 'v[0-9].[0-9]*'"
DESCRIPTION = "SEEED Studio Odyssey Image"

require basic-config.inc

# for swupdate
SWU_DESCRIPTION ??= "swupdate"
require recipes-core/images/${SWU_DESCRIPTION}.inc

