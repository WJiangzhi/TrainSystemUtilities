---
title: 自定义接触网设计
id: electrification/custom-wire
tags: [electrification, customization, tool]
---

# 自定义接触网设计

![](bws:trainsystemutilities:wiki/screens/wire-connector__ja_jp.png)

[连接工具](wire-connector.md)的 `CUSTOM` 模式所使用的自由参数调节 + 预设保存系统。

[[TOC]]

## 如何打开

1. 手持[连接工具](wire-connector.md)，通过 **Alt+滚轮** 切换到 **GUI（样式选择）** 模式。
2. **右键**点击工具，打开接触网设置界面。
3. 在左侧面板的样式磁贴中选择 **CUSTOM**，右侧面板会切换到下方的编辑模式。

## 选择 CUSTOM 时的编辑面板

选择 CUSTOM 磁贴后，右侧面板会切换到编辑模式，你可以用**鼠标滚轮**调整以下数值：

| 参数 | 范围 | 步长 | 用途 |
|---|---|---|---|
| **粗细** | 0.01 – 0.30 | 0.01 | 接触网本体的线宽（视觉） |
| **垂直间距** | 0.00 – 2.00 m | 0.05 | 承力索与接触线之间的间距（0 = 单层，>0 = 双层） |
| **吊弦间隔** | 0.50 – 10.00 m | 0.25 | 垂直支撑（吊弦）的间隔 |
| **双排布局** | OFF / ON | — | 双轨道时接触网成对并排布置 |

## 鼠标滚轮操作

将光标悬停在每个数字框上，然后：
- **滚轮向上**：增大数值
- **滚轮向下**：减小数值
- 在最小值/最大值处自动钳制

数值会实时反映到右侧面板的**预览区**（磁贴图片本身不会变化）。

## 预设保存

"**Save Preset**" 按钮仅在编辑 CUSTOM 时激活。

![](bws:trainsystemutilities:wiki/screens/wire-connector-preset-save__ja_jp.png)

1. 点击 "Save Preset" 按钮 → 出现保存对话框
2. 输入预设名称（默认：`PresetN`）
3. **Enter** 保存 / **Esc** 取消

保存后，预设会被添加到左侧面板的磁贴列表（= 样式磁贴）中，可以立即选用。

## 预设删除

**右键**点击预设磁贴 → 删除确认对话框。

![](bws:trainsystemutilities:wiki/screens/wire-connector-preset-delete__ja_jp.png)

## 如何使用预设

- 左键：应用预设 → 自定义参数被**锁定**为预设值（滚轮禁用）
- 回到编辑模式：从磁贴列表中选择 **CUSTOM**

> [!TIP]
> 预设与正在编辑的数值是分开管理的。已保存的预设无法编辑，若要修改某个预设，请新建一个并删除旧的。

## 与下垂模式的关系

下垂模式**仅适用于 SIMPLE**，不能与 CUSTOM 一起使用。
即便 CUSTOM 设计设置为单层 + 细线，也不会下垂（= 仅呈直线）。

## 与列车预设的交互

用自定义接触网铺设的路段不会保存在列车预设侧（= 接触网属于世界侧实体）。
若要在其他世界铺设外观相同的接触网，请共享连接工具的预设 JSON。

## 相关

- [接触网 / 连接工具](wire-connector.md) — 基本操作与内置样式
- [受电弓](pantograph.md)
- [箱式变电所](substation.md)
- [FE 逆变器](fe-inverter.md)
