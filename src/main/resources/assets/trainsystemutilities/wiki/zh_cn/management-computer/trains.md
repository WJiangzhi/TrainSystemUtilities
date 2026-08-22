---
title: 列车标签页
id: management-computer/trains
tags: [management-computer, train]
---

# 列车标签页

![](bws:trainsystemutilities:wiki/screens/management-computer__trains__ja_jp.png)

管理用计算机的"列车"标签页。所有列车的列表 + 详情视图。

[[TOC]]

## 如何打开

1. **放置**管理用计算机方块并**右键点击**它以打开界面。
2. **点击**左上角下拉菜单并选择**"🚂 列车"**。
3. 当列车过多无法在列表中全部显示时，在列表上转动**鼠标滚轮**滚动。

## 显示内容

| 列 | 内容 |
|---|---|
| 列车名 | 来自 Create 时刻表 |
| 车厢数 | 连挂的车厢数量 |
| 当前位置 | 车站名或运行中的路段 |
| 速度 | 实时速度 |
| 下一车站 | 下一计划停靠站 |
| 电气化 | 受电弓 / FE 缓冲 开启/关闭 |

## 列车详情弹窗

![](bws:trainsystemutilities:wiki/screens/management-computer-train-detail__ja_jp.png)

在列表中**点击某一列车的行**，会在界面右侧打开详情弹窗（如果右侧放不下则显示在左侧）。

| 信息 | 内容 |
|---|---|
| 列车名 / 车厢数 | 基本信息 |
| 时刻表 | 当前条目和下一条目 |
| 车辆编组（3D 模型） | 编组的 3D 预览 |
| 电气化 | 通过"⚡ 查看电气化状态"按钮打开[电气化详情弹窗](#電化詳細-popup) |
| 线路编号 | 已分配的编号 |

**弹窗内的操作：**

- **旋转 3D 模型**：在模型上**按住鼠标左键并拖动**。**按住 Shift 拖动**可平移；**鼠标滚轮**缩放。
- **打开电气化状态**：**点击弹窗中的"⚡ 查看电气化状态"按钮**。
- **关闭**：**点击弹窗右上角的 ✕（关闭）按钮**。

## 电气化详情弹窗 {#電化詳細-popup}

![](bws:trainsystemutilities:wiki/screens/management-computer-electrification-detail__ja_jp.png)

在列车详情弹窗中**点击"⚡ 查看电气化状态"按钮**，会在界面中央叠加打开此弹窗。它显示列车的 FE 缓冲 / 受电弓 / 接触网连接状态。

- 缓冲容量 + 剩余（每节车厢）
- 带有受电弓的车厢列表
- 带有 FE 逆变器的车厢列表
- 当前供电路段 / 来源变电所

**操作：**

- **升降受电弓**：**点击列表中每节车厢旁绘制的受电弓图标**可升降该车厢的受电弓（切换受流开启/关闭）。
- **关闭**：**点击弹窗右上角的 ✕（关闭）按钮**（返回原来的列车详情弹窗）。

详情：[电气化系统](../electrification/pantograph.md)

## 相关

- [时刻表标签页](schedule.md)
- [线路图](route-map.md)
- [连挂 / 解编](../trains/coupling.md)
- [受电弓](../electrification/pantograph.md)
