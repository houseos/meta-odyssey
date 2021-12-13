# meta-odyssey

This repository contains an [ilbers/isar](https://github.com/ilbers/isar) layer that enables hardware support for the SEEED Studio Odyssey x86 SBC.

It is based on [isar-cip-core](https://gitlab.com/cip-project/cip-core/isar-cip-core) to ensure long-term support of the used Linux Kernel and Debian packages.


## Features

This layer provides the following features:

- Linux Kernel configuration with all required drivers for the SBC (without additional peripherals)
- [siemens/efibootguard](https://github.com/siemens/efibootguard) as the bootloader for A/B update via [SWUpdate](https://github.com/sbabic/swupdate)
- Support for the ATSAMD21 Co-processor via arduino-cli
- [siemens/libuta](https://github.com/siemens/libuta) using the TPM 2.0 as a hardware trust anchor

Feature Matrix:

| Feature      | Status |
| ------------ | ------ |
| Linux Kernel | x      |
| efibootguard | x      |
| SWUpdate     | x      |
| Co-processor |        |


## How to build

First create two directories for the build, one for each image.

Second download the `kas-docker` script:

`wget https://raw.githubusercontent.com/siemens/kas/master/kas-container`

`chmod a+x kas-container`

### Build the target image

First export the absolute path to the build directory for the **HouseOS Central Service Unit** image as the `KAS_WORK_DIR` environment variable.

`./kas-container --isar build meta-odyssey-kas.yml`

The target image will be available here:

`<KAS_WORK_DIR>/build/tmp/deploy/images/seeed-odyssey/odyssey-image-debian-buster-lab-seeed-odyssey.wic.img`

## License

SPDX-License-Identifier: MIT

## Copyright 

Copyright (C) 2020-2021 Benjamin Schilling