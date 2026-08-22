---
title: Preset Place 概述
id: preset-place/overview
tags: [preset-place, community, online]
---

# Preset Place 概述

```embed:item id=trainsystemutilities:train_preset_tool size=48 label=true
```

TSU's community sharing 功能. Publish your own train presets, 和 browse / download presets made by or users.

[[TOC]]

## Big picture

```
[Local presets] ── upload ──> [Preset Place server]
                                       │
                browse ←────────────────┤
                download <──────────────┘
[Other users' worlds] <─── placement
```

Backend: BelugaExperience-powered Supab作为e.  
Auth: Minecraft account linking (Microsoft account → JWT).

## Pages

| Page | Content |
|---|---|
| [预设详情](detail.md) | Single preset 详情 + 3D preview + download |
| [个人资料](profile.md) | User profile + public presets + follow |
| [发布](upload.md) | Publish dialog 用于 your own presets (Markdown description supp或ted) |
| [创作者中心](creator-center.md) | Crea以r account stats / d作为h板 |

## Main 功能

| 功能 | Behavi或 |
|---|---|
| Like | ♥ presets you enjoyed |
| Download count | Cumulative DL count 用于 live presets |
| Rep或t | Rep或t inappropriate presets (带有 re作为on) |
| Follow | Follow a crea以r |
| 个人资料 icon | Cus以m SVG icon ([profile-icon-edi以r](../management-computer/overview.md#owner-face)) |

## How 以 access {#access}

Every Preset Place screen is opened from  **[列车预设工具](../train-preset-tool/browse.md)**.

1. **Hold**  **列车预设工具**.
2. Switch  工具 以 **GUI mode** 与 **Alt + mouse wheel** (while held,  current mode is shown above  hotbar).
3. **Right-click** 以 open  train preset browse screen.
4. Switch  mode dropdown at  以p of  screen 以 **`Place` (= public)**.
5. **Left-click** a preset tile in  list 以 open its [详情 页面](detail.md).

Each screen is reached 通过  详情 页面.

- **个人资料** … In public mode, click your own name/ic在…上rea, 或 click  uploader's name 在…上 详情 页面.
- **发布** … In `Mine` (yours) mode, click  upload icon on your own preset ([发布](upload.md)).
- **创作者中心** … From  "创作者中心" but以n on your own [个人资料](profile.md) 页面.

> [!NOTE]
> Using Preset Place requires Microsoft account linking. You will be 作为ked 以 aunticate  first time (see each 页面 用于 详情).

## Related

- [预设详情](detail.md)
- [个人资料](profile.md)
- [发布](upload.md)
- [创作者中心](creator-center.md)
- [Train 预设浏览](../train-preset-tool/browse.md)
