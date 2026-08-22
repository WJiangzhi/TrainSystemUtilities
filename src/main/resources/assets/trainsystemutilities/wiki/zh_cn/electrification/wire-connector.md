---
title: 接触网与连接工具
id: electrification/wire-connector
tags: [electrification, item, tool]
---

# 接触网与连接工具

```embed:item id=trainsystemutilities:wire_connector size=48 label=true
```

![](bws:trainsystemutilities:wiki/screens/wire-connector__ja_jp.png)

一种用于在两点之间架设接触网的专用工具。支持 5 种内置样式 + 保存任意自定义预设。

[[TOC]]

> [!IMPORTANT]
> 接触网**不能**直接架设到支柱 / 桁架上。必须升起两个**接触网绝缘子**，并在**绝缘子与绝缘子之间**架设接触网。支柱和桁架是承载绝缘子的底座。请先阅读[接触网绝缘子](insulator.md)并准备好支撑点。

## 此工具的两种模式

通过**按住 Alt 键并滚动鼠标滚轮**，连接工具可在两种模式间切换（手持时，当前模式会显示在物品栏上方）。

| 模式 | 物品栏标签 | 模式作用 |
|---|---|---|
| **放置（绝缘子连接）** | `Placement Mode` | 右键绝缘子以架设接触网（见下方"如何架设接触网"） |
| **GUI（样式选择）** | `GUI Mode` | 右键打开接触网设置界面，编辑样式或剩余量 |

> [!NOTE]
> Alt+滚轮切换的是**模式，而非接触网样式类型**。样式选择（SIMPLE / TWO_TIER 等）在"GUI 模式"下右键打开的设置界面内进行。

## 如何架设接触网（放置模式）

1. 首先在想要支撑的两个点放置**接触网绝缘子**（右键放置在地板、支柱、桁架侧面等上）。
2. 手持连接工具，用 Alt+滚轮切换到**放置（绝缘子连接）** 模式。
3. **右键第一个绝缘子** → 显示 "Connect from: X, Y, Z" 并记录起点。
4. **右键第二个绝缘子** → 在两点之间架设接触网，并显示 "Wire connected [design name]: ○○m"。
5. **重做**：再次右键同一个绝缘子，或 **Shift + 右键（向空中）** 清除起点。

> [!TIP]
> 架设有最大长度限制（工具提示显示 "Max length"）。过近 / 过远会显示红色 "Too close / Too long" 提示，无法架设接触网。

## 接触网补充（生存模式）

生存模式下，架设接触网会按架设距离（m）消耗工具的"接触网剩余量"。可在工具提示和 GUI 模式界面上方的量表中查看剩余量。

1. 准备一个**接触网线轴**（`Wire Spool` 物品；1 个提供 100 m）。
2. 用 Alt+滚轮切换到 **GUI 模式** 并右键 → 打开接触网设置界面。
3. 将线轴放入屏幕左侧的 **"Wire Load"** 槽位，点击 **"Refill Wire"** 按钮即可填充工具的内部储罐（最大 6400 m）。

> [!NOTE]
> 创造模式下无需接触网剩余量，可随意架设（剩余量显示 "Creative: unlimited wire"）。

## 如何打开设置界面（GUI 模式）

1. 用 Alt+滚轮切换到 **GUI（样式选择）** 模式。
2. **右键**点击工具（对方块或向空中） → 打开接触网设置界面。
3. 在左侧面板选择样式。
4. 在右侧面板查看 / 编辑参数。
5. 用屏幕底部的 **"Apply"** 确认设置（会出现确认对话框）。

## 内置样式（5 种）

| 样式 | 用途 | 层数 | 排数 |
|---|---|---|---|
| **CUSTOM** | 自定义预设的起点 | 自由 | 自由 |
| **SIMPLE** | 细单线，装饰用 | 1 层 | 1 排 |
| **TWO_TIER** | 标准双层（承力索 + 接触线） | 2 层 | 1 排 |
| **TWIN_2ROW** | 双轨用的平行双层 | 2 层 | 2 排 |
| **HIGH_OFFSET** | 大型车辆用的宽垂直间距 | 2 层（宽） | 1 排 |

> [!TIP]
> CUSTOM 用数字滑块自由配置。详见[自定义接触网设计](custom-wire.md)。

## 搜索 + 筛选

用 GUI 顶部的筛选下拉菜单缩小显示范围：

- **All**：内置 + 预设全部显示
- **Basic**：仅内置 5 种
- **Custom**：仅用户保存的预设

在搜索框输入名称即可即时筛选。

## 下垂模式（仅 SIMPLE）

"下垂模式"开关仅在选中 SIMPLE 样式时可操作。
开启后，单线中央会下垂以产生装饰效果（= 营造旧时代电气化的感觉）。

## 预设保存

编辑 CUSTOM 时，点击 "Save Preset" → 在对话框中输入预设名称 → Enter 保存。
保存后会添加到左侧面板的磁贴列表中，可立即选用 → 应用。

![](bws:trainsystemutilities:wiki/screens/wire-connector-preset-save__ja_jp.png)

## 预设删除

**右键**点击磁贴 → 删除确认对话框。

![](bws:trainsystemutilities:wiki/screens/wire-connector-preset-delete__ja_jp.png)

## 应用

"Apply" 按钮保存当前设置。接着，**在放置模式下右键两个绝缘子**即可用该样式架设新的接触网。
应用前会显示确认对话框。

![](bws:trainsystemutilities:wiki/screens/wire-connector-confirm__ja_jp.png)

## 相关

- [接触网绝缘子](insulator.md) — 接触网两端的支撑点（右键这些）
- [接触网支柱](overhead-pole.md) / [接触网桁架](overhead-truss.md) — 在高处承托绝缘子的底座
- [受电弓](pantograph.md) — 在接触网下运行的集电器
- [箱式变电所](substation.md) — 为接触网供电的电源
- [FE 逆变器](fe-inverter.md) — 列车侧 FE 缓冲
- [自定义接触网设计](custom-wire.md) — CUSTOM 详细参数
