---
title: 列车检测卡
id: tools/train-detection-card
tags: [tool, item, detection]
---

# 列车检测卡

```embed:item id=trainsystemutilities:train_detection_card size=48 label=true
```

一种**手持辅助卡**，将铁轨上**单一特定点**记录为"列车经过时触发的位置"。
记录的点用于[铁路管理方块](../railway-management.md)的[SAS 广播](../railway-management/announcement.md)，作为"列车经过此点时播放广播"的触发条件。

[[TOC]]

## 持有 / 使用

此卡没有专用的设置 GUI，只需**手持它、右键铁轨、记录一个点**即可。详细条件（目标列车、广播内容等）后续在**铁路管理方块的 GUI** 中设置。

1. **将列车检测卡放入快捷栏并手持。**
2. **右键要记录的铁轨方块（Create 的铁轨）**（默认为**鼠标右键**）。
   - 右键非铁轨的方块会显示类似"这不是铁轨"的提示，且不会记录任何内容。
3. 记录成功后，屏幕底部会显示"已记录点（坐标）"。
4. 手持该卡时，将光标**悬停**可在**提示信息**中查看已记录的坐标。
5. **Shift + 右键**（潜行时右键）即可**清除**已记录的点。

> [!NOTE]
> 此卡仅记录**铁轨上的一个点**。"检测范围（半径）""目标列车筛选""触发时机类型"等详细条件**都不在卡上**。
> 请在将记录好的卡插入铁路管理方块后，于[SAS 广播设置](../railway-management/announcement.md)的 GUI 中调整这些内容。

## 操作一览

| 操作 | 效果 |
|---|---|
| **右键**铁轨 | 将该铁轨点记录为检测点 |
| **Shift + 右键** | 清除已记录的点 |
| 光标**悬停**于卡上 | 在提示信息中查看已记录的坐标 |

## 与铁路管理方块配合使用

记录好的卡通过以下流程成为真正的触发条件。

1. 按上述步骤记录希望播放广播的铁轨点。
2. 右键打开[铁路管理方块](../railway-management.md)，再打开[SAS 广播设置](../railway-management/announcement.md)。
3. 在广播设置中，**将这张记录好的卡插入检测卡插槽**。
4. 此后，当列车经过所记录的铁轨点时，便会播放配置好的广播。

## 集成

- 作为[SAS 广播](../railway-management/announcement.md)的播放触发（通过检测点）

## 相关

- [铁路管理方块](../railway-management.md)
- [SAS 广播设置](../railway-management/announcement.md)
- [车站范围指定工具](station-range-tool.md)
