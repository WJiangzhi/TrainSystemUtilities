---
title: 车站范围指定工具
id: tools/station-range-tool
tags: [tool, station]
---

# 车站范围指定工具

```embed:item id=trainsystemutilities:station_range_tool size=48 label=true
```

![](bws:trainsystemutilities:wiki/screens/station-group-save__ja_jp.png)

一种通过指定两点来将一片车站区域注册为**车站组**的工具。
它可将多个铁路管理方块归并为一个车站，从而一次性应用通用设置（颜色 / 设置 / 广播）。

[[TOC]]

## 模式切换

此工具用 **Alt + 鼠标滚轮**在三种模式间切换（手持时，当前模式会显示在快捷栏上方）。

| 模式 | 行为 |
|---|---|
| 选择（默认） | 左键点击范围的两个角，创建车站组 |
| GUI | 右键打开车站组管理 GUI |
| 显示 | 显示世界中已有车站组的轮廓 |

## 用法（选择模式）

1. 手持工具并**左键**点击车站区域的第一个角。
2. **左键**点击对角的另一个角。
3. 右键工具 → 弹出车站组保存 GUI。
4. 输入车站组名称 → 回车保存。

## 股道编号模式

保存时可选择一种**股道自动编号**模式：

| 模式 | 行为 |
|---|---|
| AUTO | 自动编号，内侧 = 股道 1 |
| LEFT | 左边缘 = 股道 1 |
| RIGHT | 右边缘 = 股道 1 |

## 车站组管理

![](bws:trainsystemutilities:wiki/screens/station-group-manage__ja_jp.png)

用 **Alt + 鼠标滚轮**将工具切换到 **GUI** 模式，然后**右键**打开管理 GUI，在其中可对已保存的车站组进行：
- 重命名
- 删除（带确认对话框）
- 查看成员车站

> [!NOTE]
> 车站组管理没有命令，全部通过此工具的 GUI 模式完成。

![](bws:trainsystemutilities:wiki/screens/station-group-manage-delete__ja_jp.png)

## 车站组的使用场景

- [管理用计算机车站标签页](../management-computer/stations.md) 为该组分配线路符号
- [铁路管理方块批量应用](../railway-management/settings.md#batch-apply) 一次性为同一组内的全部成员应用设置
- [SAS 广播](../railway-management/announcement.md) 的共享目的地（share）
- [自动售票机](../structure/ticket-vending-machine.md) 的**候选售票车站**（从[车票标签页](../management-computer/tickets.md)中的车站组里选取）
- 识别**自动检票闸机**所指向的车站
- [换乘查询终端](transit-terminal.md) **路径检索**的目标（以车站组作为起讫点进行检索）

> [!NOTE]
> 自动售票机、自动检票闸机和换乘检索都**以本工具创建的车站组作为共享数据引用。** 在使用它们之前，请先将目标车站注册为车站组。

## 相关

- [铁路管理方块](../railway-management.md)
- [管理用计算机车站标签页](../management-computer/stations.md)
- [存储卡](memory-card.md)
