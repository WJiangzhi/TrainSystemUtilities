---
title: 铁路管理方块
id: railway-management
tags: [station, display, block]
---

# 铁路管理方块

![](bws:trainsystemutilities:wiki/screens/railway-management__ja_jp.png)

放置在车站月台上的显示板方块。它会自动显示已停靠 / 即将到站的列车，并可与显示器、颜色设置和广播（SAS）整合。

[[TOC]]

## 如何打开

1. 将**铁路管理方块**放置在车站月台上。和 Create 的车站方块一样，通过**右键已铺设的轨道**将其放置到轨道上。
2. 对已放置的方块**右键**打开 GUI。
3. 显示哪个车站，需用[存储卡](tools/memory-card.md)将此方块与[管理用计算机](management-computer/overview.md)链接后决定。
4. 第一个右键它的人成为**所有者**。当右下角脸形图标设为**私有**时，除所有者外无人能打开它（[访问模式](getting-started.md#access-mode)）。

> [!NOTE]
> 本方块和 Create 的车站一样是「放置在轨道上」的，不能放在空地上。请先铺设轨道，再右键该轨道。

## 操作（点击 / 滚动位置）

GUI 内的全部操作都通过**鼠标**完成（无需键盘）。

| 想做的事 | 操作方法 |
|---|---|
| 开启 / 关闭显示器 | **点击显示器所在行的开关** |
| 打开显示器设置 | **点击显示器行的「⚙ 设置」按钮** → [显示器设置](railway-management/settings.md) 弹窗 |
| 打开颜色设置 | **点击显示器行的「▒ 颜色」按钮** → [颜色设置](railway-management/color.md) 弹窗 |
| 打开广播 / 月台屏门设置 | **点击显示器行的「功能 ▼」按钮** → 在出现的列表中**点击「广播」或「月台屏门」** |
| 推进即将到站列车列表 | 按设定间隔自动翻页（无需手动操作） |
| 显示提示 | **点击右上角的「Hint」开关**将其打开。在此状态下，将光标悬停在按钮上并按 **F1** 可跳转到该功能的 wiki 说明（[F1 的使用方法](getting-started.md#hints-and-f1)） |
| 切换私有 / 公开 | **点击右下角的脸形图标** |

> [!TIP]
> 本方块是放置在车站月台上的「仅显示」板。如需批量调整数字或颜色，请在弹窗侧操作（[显示器设置](railway-management/settings.md) / [颜色设置](railway-management/color.md)）。弹窗内的数字通过**将光标悬停在数值上并滚动鼠标滚轮**来增减（没有 ＋ / − 按钮）。

## 概览

| 功能 | 说明 |
|---|---|
| 到站列车显示 | 顶行显示已停靠的列车（列车名 / 车厢数 / 到站时间 / 发车时间） |
| 下趟列车显示 | 下方各行显示接下来到站的列车（多趟） |
| 线路编号 | 在头部显示[已分配的](management-computer/stations.md)线路编号 |
| 显示器链接 | 在附近的显示器方块上显示相同内容 |
| 颜色自定义 | 通过[颜色弹窗](railway-management/color.md)更改每个文本元素的颜色 |
| 广播（SAS） | 通过 [SpatialAudioSystem](railway-management/announcement.md) 整合播放发车旋律 / 广播 |
| 批量应用 | 一次性将设置应用到同一网络中的全部方块 |

## GUI 主要元素

![](bws:trainsystemutilities:wiki/screens/railway-management__ja_jp.png)

| 元素 | 功能 |
|---|---|
| `Hint` 开关 | F1 跳转 + 鼠标悬停说明的 开 / 关 |
| 头部编号 | 已分配的线路编号（无则隐藏） |
| 到站列车列表 | 1 项，当前停靠的列车 |
| 下趟列车列表 | 按到站顺序从上到下排列，带分页 |
| 显示器行 | 显示器开关 + 状态显示 + 设置 / 颜色 / 广播按钮 |
| 所有者脸形 | 私有 / 公开切换 |
| 物品栏 | 玩家物品栏 |

## 相关弹窗

| 弹窗 | 内容 |
|---|---|
| [显示器设置](railway-management/settings.md) | 字体大小 / 轨道位置 / 时钟显示 / 批量应用 |
| [颜色设置](railway-management/color.md) | 10 个文本元素的颜色（到站时间、发车时间、列车名 等） |
| [广播设置](railway-management/announcement.md) | SAS 整合的条目管理（条件触发） |

## 相关

- [管理用计算机概述](management-computer/overview.md) — 所有车站与列车的总览管理
- [显示器连接卡](tools/monitor-link-card.md) — 与附近显示器链接
- [车站范围指定工具](tools/station-range-tool.md) — 注册车站组
