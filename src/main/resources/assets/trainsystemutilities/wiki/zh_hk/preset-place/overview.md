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

Backend: BelugaExperience-powered Supab作為e.  
Auth: Minecraft account linking (Microsoft account → JWT).

## Pages

| Page | Content |
|---|---|
| [預設詳情](detail.md) | Single preset 詳情 + 3D preview + download |
| [個人資料](profile.md) | User profile + public presets + follow |
| [發佈](upload.md) | Publish dialog 用於 your own presets (Markdown description supp或ted) |
| [創作者中心](creator-center.md) | Crea以r account stats / d作為h板 |

## Main 功能

| 功能 | Behavi或 |
|---|---|
| Like | ♥ presets you enjoyed |
| Download count | Cumulative DL count 用於 live presets |
| Rep或t | Rep或t inappropriate presets (帶有 re作為on) |
| Follow | Follow a crea以r |
| 個人資料 icon | Cus以m SVG icon ([profile-icon-edi以r](../management-computer/overview.md#owner-face)) |

## How 以 access {#access}

Every Preset Place screen is opened from  **[列車預設工具](../train-preset-tool/browse.md)**.

1. **Hold**  **列車預設工具**.
2. Switch  工具 以 **GUI mode** 與 **Alt + mouse wheel** (while held,  current mode is shown above  hotbar).
3. **Right-click** 以 open  train preset browse screen.
4. Switch  mode dropdown at  以p of  screen 以 **`Place` (= public)**.
5. **Left-click** a preset tile in  list 以 open its [詳情 頁面](detail.md).

Each screen is reached 通過  詳情 頁面.

- **個人資料** … In public mode, click your own name/ic在…上rea, 或 click  uploader's name 在…上 詳情 頁面.
- **發佈** … In `Mine` (yours) mode, click  upload icon on your own preset ([發佈](upload.md)).
- **創作者中心** … From  "創作者中心" but以n on your own [個人資料](profile.md) 頁面.

> [!NOTE]
> Using Preset Place requires Microsoft account linking. You will be 作為ked 以 aunticate  first time (see each 頁面 用於 詳情).

## Related

- [預設詳情](detail.md)
- [個人資料](profile.md)
- [發佈](upload.md)
- [創作者中心](creator-center.md)
- [Train 預設瀏覽](../train-preset-tool/browse.md)
