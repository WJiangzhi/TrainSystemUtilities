---
title: 列车预设保存
id: train-preset-tool/save
tags: [tool, preset, train]
---

# 列车预设保存

```embed:item id=trainsystemutilities:train_preset_tool size=48 label=true
```

![](bws:trainsystemutilities:wiki/screens/train-preset-save__ja_jp.png)

**列车预设工具**的保存界面，可将列车结构序列化为 JSON 并作为模板存储。用工具选定范围后，执行保存动作即可打开此界面。

[[TOC]]

## 功能

- 扫描范围内的所有方块 + 车厢实体
- 以 JSON 格式保存到**内部存储**（文件：`<gamedir>/trainsystemutilities/presets/<author>/<name>.json`）
- 可迁移到其他世界 / 其他玩家
- 也可通过 [Preset Place](../preset-place/overview.md) 在线分享

## 持有 / 模式

**列车预设工具**有 3 种模式。切换到该工具后即为 **GUI 模式**。保存使用**选择模式**。

- **GUI 模式**（初始状态）：右键打开[预设浏览 / 放置](browse.md)界面。
- **选择模式**：用于指定围住列车的两个点（Pos1 / Pos2）的模式。确定范围后右键即可打开此**保存界面**。
- **放置模式**：用于将已保存的预设放入世界的模式（见[预设浏览 / 放置](browse.md)）。

用 **Alt + 鼠标滚轮**切换模式。手持时，当前模式会显示在快捷栏上方。

## 打开 / 用法

1. **手持**列车预设工具。
2. 用 **Alt + 滚轮**切换到**选择模式**。
3. 要围住你想保存的列车，请**右键第一个角的位置**（默认：**鼠标右键**）（记录 `Pos1`）。
4. **右键对角的另一个角**（记录 `Pos2`，范围就此确定）。要记录精确位置，请瞄准该方块并右键。
5. 两个点都设置好后，**再次右键**即可打开**保存界面**。
6. 在界面的输入框中**用键盘输入预设名称**，按 **Enter** 保存（**左键保存按钮**也可保存）。名称为空时无法保存。
7. **Shift + 右键**清除已记录的范围（Pos1 / Pos2）。想重新开始时使用。

> [!TIP]
> 将鼠标**悬停**在工具上时，可从显示的提示信息中查看当前模式以及 Pos1 / Pos2 是否已记录。

## 限制

- 最大体积：256×256×256 方块（上限 1670 万方块）
- 过大的范围会被提前拒绝，以防服务器卡死
- 未加载区块内的方块会被排除

## 相关

- [预设浏览 / 放置](browse.md)
- [材料补充](refill.md)
- [Preset Place 概述](../preset-place/overview.md)
