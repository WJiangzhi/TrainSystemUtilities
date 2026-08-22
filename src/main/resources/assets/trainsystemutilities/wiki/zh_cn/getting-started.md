---
title: 快速开始
id: getting-started
tags: [tutorial, beginner]
---

# 快速开始

本页面帮助你逐步了解：刚拿到 TrainSystem Utilities 时，「哪个 GUI 管理什么」「按下 F1 会发生什么」。

[[TOC]]

> [!NOTE]
> 本 MOD 需要 **Create 1.21.1 兼容版本**。它与 Create 的时刻表 / 车站 / 信号机制紧密集成。

## 本 MOD 的 GUI 一览

TSU 的 GUI 大致分为 **「右键方块打开的」** 和 **「手持物品使用的」** 两类。按下文「如何打开」一栏所示的方式操作即可打开对应 GUI。

### 方块 GUI（放置后右键）

| GUI | 如何打开 | 作用 |
|---|---|---|
| 管理用计算机 | 放置方块后 **右键** | 监控与配置整个网络的中枢。通过下方的标签组切换使用 |
| 铁路管理方块 | 放置在车站月台上并 **右键** | 单个车站的显示板（到站 / 下一趟列车 / 车站显示器） |
| 海报管理方块 | **右键** 方块 | 以轮播方式显示 PNG/JPG 图片 |
| 自动售票机 | **右键** 方块 | 选择目的地并购票 |

### 管理用计算机的标签页 / 子界面

通过标签切换或按钮，从管理用计算机中打开。

| 界面 | 如何打开 | 作用 |
|---|---|---|
| 线路图 / 列车 / 时刻表 / 车站 / 自动售票机 / 线路编号 标签页 | 用左上角下拉框（显示器）或标签切换 | 各功能的列表 / 设置 |
| 线路编号编辑器 | 线路编号标签页 → **「＋ 新建」** / 点击已有编号 | 编辑编号的文字 / 颜色 / 形状（内置取色器） |
| 布局编辑器 | 底部的 **「Layout」** 按钮 | 编辑显示器面板的排列方式 |
| 颜色设置 / 取色器 | 底部的 **「Color」** 按钮 | 更改显示器的配色 |
| 时刻表编辑器 | 时刻表标签页 → 选择一列列车并编辑 | 编辑 / 导出 Create 时刻表 |

### 物品 GUI / 工具（手持使用）

| 工具 | 如何打开 / 操作 | 作用 |
|---|---|---|
| 换乘查询终端 | 手持并 **右键** | 路线、行驶时间与车站间耗时的导引 |
| 车站范围指定工具 | 手持，用 **Alt+滚轮** 切换模式，右键指定 | 创建车站组 / 关联自动售票机与闸门 |
| 列车预设工具 | 手持并 **右键**（设置）/ 通过模式切换放置 | 将列车保存为 JSON、放置列车、补充材料 |
| 连接工具 | 手持并 **右键** | 铺设接触网 / 自定义接触网预设 |
| 电线杆自动放置工具 | 手持，用 **Alt/Ctrl/Shift+滚轮** 配置，右键放置 | 依次自动放置电线杆 |

### 电气化系统（方块 / 设备）

| 设备 | 作用 |
|---|---|
| 受电弓 / 接触网 / 箱式变电所 / FE 逆变器 | 通过架空接触网为列车提供 FE / Create 能量（详见 [电气化系统](electrification/pantograph.md)） |

### 在线共享（Preset Place）

| 界面 | 如何打开 | 作用 |
|---|---|---|
| 预设浏览 / 详情 / 上传 / 个人资料 / 创作者中心 | 从列车预设工具的菜单中打开 | 在线共享你自己的列车预设 |

### 铁路管理方块预览

![](bws:trainsystemutilities:wiki/screens/railway-management__ja_jp.png)

### 连接工具预览

![](bws:trainsystemutilities:wiki/screens/wire-connector__ja_jp.png)

## 提示与 F1 {#hints-and-f1}

在每个 GUI 右上角打开 **Hint** 开关后，将鼠标悬停在按钮 / 物品上时会显示简短说明。  
在此状态下按 **F1**，wiki 会直接跳转到你当前悬停功能的说明章节。

> [!TIP]
> 把 F1 理解成 **「跳转到该功能说明的按键」**，而不是「打开 wiki 的按键」会更好。
> 例如：将鼠标悬停在显示器开关上按 F1 → 直接打开「显示器显示」章节。

### 使用流程

1. 将 `Hint` 开关打开。
2. 把光标移到你想了解的按钮 / 标签上。
3. 按下 **F1**。
4. 自动跳转到对应功能的 wiki 标题。

## 建议先熟悉的一条流程

1. 在 [管理用计算机概述](management-computer/overview.md) 中了解各标签页分别负责什么。
2. 想观察列车运行时，阅读 [列车标签页](management-computer/trains.md) 与 [时刻表标签页](management-computer/schedule.md)。
3. 想整理车站显示的线路编号时，阅读 [车站标签页](management-computer/stations.md) 与 [线路编号标签页](management-computer/line-symbols.md)。
4. 想查看车站侧的显示时，阅读 [铁路管理方块](railway-management.md)。
5. 想搭建图片显示时，阅读 [海报管理方块](poster-management.md)。
6. 想为列车供电时，阅读 [电气化系统](electrification/pantograph.md)。

> [!WARNING]
> 服务器运行时，**私有模式** 是必须的。其他玩家可能会改写你的时刻表。
> 原则上，主线上的管理用计算机应设为私有。

## 选择访问模式 {#access-mode}

可以通过每个 GUI 右下角的脸形图标切换模式。

<details>
<summary>私有 / 公开的区别</summary>

| 模式 | 显示 | 设置更改 | 适用场景 |
|---|---|---|---|
| 公开 | 蓝框脸形 | 任何人都能更改 | 协作运营 / 测试世界 |
| 私有 | 红框脸形 | 仅放置者可改 | 主线运营 / 多人联机 |

使用存储卡创建和读取链接与模式无关，但开关操作和颜色设置受访问模式限制。

</details>

## GUI 自动缩放

所有 V3 GUI 都会自动按 Minecraft 的 GUI 缩放（1×/2×/3×/4×）和屏幕尺寸进行缩小适配。

- **基准为 GUI 缩放 2×**（= 1920×1080 下 960×540 视口）。所有对话框都按此基准设计。
- 在 4× 或小屏 MOD 环境下对话框溢出时会自动缩小（5% 边距）
- 可通过子类的 `autoScaleEnabled() = false` 禁用

## 新 wiki 系统功能

本页使用的 `embed:item` / `embed:items` / `embed:screen` / `embed:model` 机制：

| 语法 | 用途 |
|---|---|
| `embed:item id=<modid:itemid> size=N` | ItemStack 渲染，和物品栏格子一样 |
| `embed:model id=<itemid> size=N rotate=true` | BlockItem 的 3D 展示（自动旋转） |
| `embed:screen id=<screen-id>` | 显示截取的 V3 界面（自动切换到当前语言） |

GUI 截图在登录时自动生成，因此无需打开界面即可在 wiki 中查看全部内容。  
切换语言后，运行 `/tsu-wiki-prebuild` 重新生成该语言的截图。

## 接下来阅读的页面

- [管理用计算机概述](management-computer/overview.md)
- [铁路管理方块](railway-management.md)
- [电气化系统](electrification/pantograph.md)
- [海报管理方块](poster-management.md)
