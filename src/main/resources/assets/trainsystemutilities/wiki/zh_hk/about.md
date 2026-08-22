---
title: 什麼是 TrainSystem Utilities
id: about
---

# 什麼是 TrainSystem Utilities

列車管理系統（TrainSystem Utilities，簡稱 TSU）是 Minecraft **Create MOD（1.21.1）** 的擴展 MOD，為遊戲添加鐵路相關的便捷功能。  
在 Create 現有的「軌道 / 車站 / 時刻表 / 信號」基礎上，TSU 以 **造型逼真、操作簡單** 的形式提供車站顯示板、路網總覽管理、顯示器整合、線路編號、**電氣化系統** 等功能。

[[TOC]]

## 本 MOD 能做哪些事？

| 功能 | 説明 |
|---|---|
| 車站級顯示板 | 在車站月台上放置「鐵路管理方塊」，自動顯示已停靠 / 即將到站的列車 |
| 路網總覽管理 | 使用「管理用計算機」集中管理全部車站 / 列車 / 時刻表 |
| 車站顯示器整合 | 在車站附近放置顯示器方塊即可實時顯示信息 |
| 線路編號 | 創建 JA01 / JB02 等自定義線路編號並分配給車站 |
| 連掛 / 解編 | 通過時刻表條件動態地讓兩列列車連掛 / 解編 |
| 海報顯示 | 以輪播方式顯示 PNG/JPG 圖片的廣告板 |
| **電氣化系統** | **受電弓 + 接觸網 + 變電所 + FE 逆變器，為列車提供 FE / Create 能量** |
| 列車預設 | 將整列列車以 JSON 格式保存 / 恢復 / 分享 |
| Preset Place | 在線共享列車預設（基於 BelugaExperience 平台） |

### 新增物品 / 方塊

> [!TIP]
> **右下角帶有藍色標記** 的圖標可以點擊跳轉到對應頁面。

#### 車站與顯示 (11)

```embed:items size=32 cols=5 label=true ids=trainsystemutilities:railway_management_block,trainsystemutilities:management_computer,trainsystemutilities:poster_management_block,trainsystemutilities:monitor,trainsystemutilities:double_monitor,trainsystemutilities:monitor_half,trainsystemutilities:double_monitor_half,trainsystemutilities:monitor_slim,trainsystemutilities:double_monitor_slim,trainsystemutilities:station_name_sign,trainsystemutilities:station_name_sign_pole links=railway-management,management-computer/overview,poster-management,-,-,-,-,-,-,structure/station-name-sign,structure/station-name-sign
```

#### 工具 (3)

```embed:items size=32 cols=5 label=true ids=trainsystemutilities:station_range_tool,trainsystemutilities:train_preset_tool,trainsystemutilities:transit_terminal links=tools/station-range-tool,tools/train-preset-tool,tools/transit-terminal
```

#### 數據卡 (3)

```embed:items size=32 cols=5 label=true ids=trainsystemutilities:memory_card,trainsystemutilities:monitor_link_card,trainsystemutilities:train_detection_card links=tools/memory-card,tools/monitor-link-card,tools/train-detection-card
```

#### 電氣化 (6)

```embed:items size=32 cols=5 label=true ids=trainsystemutilities:wire_connector,trainsystemutilities:pantograph,trainsystemutilities:fe_inverter,trainsystemutilities:substation,trainsystemutilities:insulator,trainsystemutilities:power_checker links=electrification/wire-connector,electrification/pantograph,electrification/fe-inverter,electrification/substation,electrification/insulator,electrification/power-checker
```

→ 參見 [電氣化系統 概述](electrification/index.md) 瞭解詳情。

> [!TIP]
> **本 MOD 不會「自動駕駛列車」**。列車運行由 Create 的時刻表負責。
> TSU 是「讓 Create 列車的查看、管理與供電更加方便」的輔助工具集。

## 需要搭配哪些 MOD 使用？ {#推薦的-mods}

| MOD | 作用 | 是否必需？ |
|---|---|---|
| **Create** | 鐵路機制核心 | ✅ 必需 |
| **Manta** | GUI / 顯示器 / Wiki / BelugaExperience 渲染框架 | ✅ 必需 |
| **SpatialAudioSystem** | 音效 例如 車站 發車旋律 和廣播 (作者的另一個 MOD) | 推薦 |
| **Mekanism / Applied Energistics 2** | 用於為電氣化系統提供 FE 能量源 | 使用電氣化系統時需要 |
| Create: New Age 等 | 額外的列車機制 | 可選 |
| BSL Shaders 等 | 畫質增強 / 視覺美化 | 可選 |

> [!NOTE]
> 搭配 **SpatialAudioSystem** 使用時，發車旋律與車內廣播會和 TSU 車站顯示在同一車站同步播放，大幅提升車站氛圍。

## 什麼是 it good 用於?

Good 用於:

- **Large-scale 網絡 operation**: you want 來管理 many 車站 / 列車 from a single list
- **Atmospheric 車站 building**: you want 以 give 車站 character 與 顯示器, 線路 編號, 和 poster guidance
- **Multiplayer rail operation**: you want 以 build 時刻表 以ger while preventing accidental edits
- **Electrified 線路 construction**: you want 以 reproduce electric train operation 與 overhead wire 和 FE power 供給
- **列車預設 sharing**: you want 以 save your own 列車 以 JSON 格式 和 share m 與 or w或lds 或 players

Not good 用於:

- **Running just a single freight train**: at  scale  管理用計算機 is overkill
- **Using 與out Create**: TSU does nothing on its own

## Architectural pieces (用於 advanced users)

- **BelugaExperience UI 系統**: V3 GUI widget framew或k (controller + json builder + au以-sizing). In  `belugalab.experience.*` package.
- **MCSS Wiki**: 遊戲內 markdown wiki + JSON-driven embeds (`embed:screen` / `embed:item` / `embed:items`)
- **GUI capture pipe線路**: on login, 全部 layout JSONs are captured 通過 an off-screen FBO → reflected in  wiki immediately 作為 DynamicTextures
- **i18n**: when switching between ja_jp / en_us, run `/tsu-wiki-prebuild` 以 regenerate  language-specific captures

## Pages 以 read first

- [快速開始](getting-started.md) —  sh或test route 以 getting started
- [管理用計算機 概述](management-computer/overview.md) — a 以ur of  中樞 GUI
- [鐵路管理方塊](railway-management.md) —  車站 顯示 板
- [海報管理方塊](poster-management.md) —  image 板
- [電氣化系統](electrification/pantograph.md)

## Development status

> [!IMPORTANT]
> This is a MOD in development. Setting save 形式ats 和 APIs may change.
> Be用於e running it in production 在…上 large w或ld, we recommend confirming its behavi或 以… test w或ld.
