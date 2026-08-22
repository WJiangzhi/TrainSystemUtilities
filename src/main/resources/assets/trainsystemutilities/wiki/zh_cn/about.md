---
title: 什么是 TrainSystem Utilities
id: about
---

# 什么是 TrainSystem Utilities

列车管理系统（TrainSystem Utilities，简称 TSU）是 Minecraft **Create MOD（1.21.1）** 的扩展 MOD，为游戏添加铁路相关的便捷功能。  
在 Create 现有的「轨道 / 车站 / 时刻表 / 信号」基础上，TSU 以 **造型逼真、操作简单** 的形式提供车站显示板、路网总览管理、显示器整合、线路编号、**电气化系统** 等功能。

[[TOC]]

## 本 MOD 能做哪些事？

| 功能 | 说明 |
|---|---|
| 车站级显示板 | 在车站月台上放置「铁路管理方块」，自动显示已停靠 / 即将到站的列车 |
| 路网总览管理 | 使用「管理用计算机」集中管理全部车站 / 列车 / 时刻表 |
| 车站显示器整合 | 在车站附近放置显示器方块即可实时显示信息 |
| 线路编号 | 创建 JA01 / JB02 等自定义线路编号并分配给车站 |
| 连挂 / 解编 | 通过时刻表条件动态地让两列列车连挂 / 解编 |
| 海报显示 | 以轮播方式显示 PNG/JPG 图片的广告板 |
| **电气化系统** | **受电弓 + 接触网 + 变电所 + FE 逆变器，为列车提供 FE / Create 能量** |
| 列车预设 | 将整列列车以 JSON 格式保存 / 恢复 / 分享 |
| Preset Place | 在线共享列车预设（基于 BelugaExperience 平台） |

### 新增物品 / 方块

> [!TIP]
> **右下角带有蓝色标记** 的图标可以点击跳转到对应页面。

#### 车站与显示 (11)

```embed:items size=32 cols=5 label=true ids=trainsystemutilities:railway_management_block,trainsystemutilities:management_computer,trainsystemutilities:poster_management_block,trainsystemutilities:monitor,trainsystemutilities:double_monitor,trainsystemutilities:monitor_half,trainsystemutilities:double_monitor_half,trainsystemutilities:monitor_slim,trainsystemutilities:double_monitor_slim,trainsystemutilities:station_name_sign,trainsystemutilities:station_name_sign_pole links=railway-management,management-computer/overview,poster-management,-,-,-,-,-,-,structure/station-name-sign,structure/station-name-sign
```

#### 工具 (3)

```embed:items size=32 cols=5 label=true ids=trainsystemutilities:station_range_tool,trainsystemutilities:train_preset_tool,trainsystemutilities:transit_terminal links=tools/station-range-tool,tools/train-preset-tool,tools/transit-terminal
```

#### 数据卡 (3)

```embed:items size=32 cols=5 label=true ids=trainsystemutilities:memory_card,trainsystemutilities:monitor_link_card,trainsystemutilities:train_detection_card links=tools/memory-card,tools/monitor-link-card,tools/train-detection-card
```

#### 电气化 (6)

```embed:items size=32 cols=5 label=true ids=trainsystemutilities:wire_connector,trainsystemutilities:pantograph,trainsystemutilities:fe_inverter,trainsystemutilities:substation,trainsystemutilities:insulator,trainsystemutilities:power_checker links=electrification/wire-connector,electrification/pantograph,electrification/fe-inverter,electrification/substation,electrification/insulator,electrification/power-checker
```

→ 参见 [电气化系统 概述](electrification/index.md) 了解详情。

> [!TIP]
> **本 MOD 不会「自动驾驶列车」**。列车运行由 Create 的时刻表负责。
> TSU 是「让 Create 列车的查看、管理与供电更加方便」的辅助工具集。

## 需要搭配哪些 MOD 使用？ {#推荐的-mods}

| MOD | 作用 | 是否必需？ |
|---|---|---|
| **Create** | 铁路机制核心 | ✅ 必需 |
| **Manta** | GUI / 显示器 / Wiki / BelugaExperience 渲染框架 | ✅ 必需 |
| **SpatialAudioSystem** | 音效 例如 车站 发车旋律 和广播 (作者的另一个 MOD) | 推荐 |
| **Mekanism / Applied Energistics 2** | 用于为电气化系统提供 FE 能量源 | 使用电气化系统时需要 |
| Create: New Age 等 | 额外的列车机制 | 可选 |
| BSL Shaders 等 | 画质增强 / 视觉美化 | 可选 |

> [!NOTE]
> 搭配 **SpatialAudioSystem** 使用时，发车旋律与车内广播会和 TSU 车站显示在同一车站同步播放，大幅提升车站氛围。

## 什么是 it good 用于?

Good 用于:

- **Large-scale 网络 operation**: you want 来管理 many 车站 / 列车 from a single list
- **Atmospheric 车站 building**: you want 以 give 车站 character 与 显示器, 线路 编号, 和 poster guidance
- **Multiplayer rail operation**: you want 以 build 时刻表 以ger while preventing accidental edits
- **Electrified 线路 construction**: you want 以 reproduce electric train operation 与 overhead wire 和 FE power 供给
- **列车预设 sharing**: you want 以 save your own 列车 以 JSON 格式 和 share m 与 or w或lds 或 players

Not good 用于:

- **Running just a single freight train**: at  scale  管理用计算机 is overkill
- **Using 与out Create**: TSU does nothing on its own

## Architectural pieces (用于 advanced users)

- **BelugaExperience UI 系统**: V3 GUI widget framew或k (controller + json builder + au以-sizing). In  `belugalab.experience.*` package.
- **MCSS Wiki**: 游戏内 markdown wiki + JSON-driven embeds (`embed:screen` / `embed:item` / `embed:items`)
- **GUI capture pipe线路**: on login, 全部 layout JSONs are captured 通过 an off-screen FBO → reflected in  wiki immediately 作为 DynamicTextures
- **i18n**: when switching between ja_jp / en_us, run `/tsu-wiki-prebuild` 以 regenerate  language-specific captures

## Pages 以 read first

- [快速开始](getting-started.md) —  sh或test route 以 getting started
- [管理用计算机 概述](management-computer/overview.md) — a 以ur of  中枢 GUI
- [铁路管理方块](railway-management.md) —  车站 显示 板
- [海报管理方块](poster-management.md) —  image 板
- [电气化系统](electrification/pantograph.md)

## Development status

> [!IMPORTANT]
> This is a MOD in development. Setting save 形式ats 和 APIs may change.
> Be用于e running it in production 在…上 large w或ld, we recommend confirming its behavi或 以… test w或ld.
