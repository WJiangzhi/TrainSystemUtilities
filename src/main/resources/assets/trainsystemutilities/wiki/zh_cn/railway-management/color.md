---
title: 颜色设置
id: railway-management/color
tags: [station, color]
---

# 颜色设置

![](bws:trainsystemutilities:wiki/screens/railway-management-color__ja_jp.png)

通过铁路管理方块上「颜色」按钮打开的弹窗。可更改 10 个文本元素各自的颜色。

[[TOC]]

## 如何打开

1. 对[铁路管理方块](../railway-management.md)**右键**打开其 GUI。
2. **点击显示器行的「▒ 颜色」按钮**，此颜色设置弹窗会出现在对话框右侧。
3. 再次点击「▒ 颜色」按钮可关闭它。

## 可编辑对象 (10)

| key | 显示元素 |
|---|---|
| `arrTime` | 到站时间 |
| `depTime` | 发车时间 |
| `stopInfo` | 停靠信息 |
| `routeType` | 列车类型 |
| `stopSec` | 停靠秒数 |
| `trainName` | 列车名 |
| `nextName` | 下趟列车名 |
| `sectionTitle` | 章节标题 |
| `countdown` | 倒计时 |
| `trackNumber` | 轨道编号 |

## 预设颜色 (12)

从弹窗底部的预设色板中一键应用颜色：

```
#4fc3f7 (cyan)   #80deea (light cyan)  #ff8a65 (orange)  #ffc107 (yellow)
#66bb6a (green)  #ef5350 (red)         #ab47bc (purple)  #ffffff (white)
#888888 (gray)   #555555 (dim)         #444444 (darker)  #333333 (darkest)
```

## 操作（点击位置）

1. **点击弹窗顶部的下拉框（带 ▾）** → 在列表中**点击**你想更改颜色的**编辑对象**（到站时间 / 列车名 / 轨道编号 等 — 上述 10 项）。
2. **点击弹窗底部的预设颜色**，该颜色即立即应用到所选对象。
3. 如需还原，点击**「重置当前」按钮**（仅重置所选对象）或**「重置全部」按钮**（重置全部 10 项）。

> [!NOTE]
> 本弹窗采用从 12 个预设中**点击选取**的方式。带色相轮与 HEX 输入的完整[取色器](../management-computer/symbol-editor.md#color-picker)用于其他界面，如[线路编号编辑器](../management-computer/symbol-editor.md)。

## 按面管理

**点击「↻ 前 / 后切换」按钮**在前 / 后之间切换，可为每一面设置不同的颜色组合。  
也支持[批量应用](settings.md#batch-apply)（见[显示器设置](settings.md#batch-apply)）。

## 相关

- [铁路管理方块](../railway-management.md)
- [显示器设置](settings.md)
- [取色器（管理用计算机）](../management-computer/symbol-editor.md#color-picker)
