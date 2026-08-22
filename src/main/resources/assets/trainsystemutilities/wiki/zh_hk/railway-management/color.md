---
title: 顏色設置
id: railway-management/color
tags: [station, color]
---

# 顏色設置

![](bws:trainsystemutilities:wiki/screens/railway-management-color__ja_jp.png)

通過鐵路管理方塊上「顏色」按鈕打開的彈窗。可更改 10 個文本元素各自的顏色。

[[TOC]]

## 如何打開

1. 對[鐵路管理方塊](../railway-management.md)**右鍵**打開其 GUI。
2. **點擊顯示器行的「▒ 顏色」按鈕**，此顏色設置彈窗會出現在對話框右側。
3. 再次點擊「▒ 顏色」按鈕可關閉它。

## 可編輯對象 (10)

| key | 顯示元素 |
|---|---|
| `arrTime` | 到站時間 |
| `depTime` | 發車時間 |
| `stopInfo` | 停靠信息 |
| `routeType` | 列車類型 |
| `stopSec` | 停靠秒數 |
| `trainName` | 列車名 |
| `nextName` | 下趟列車名 |
| `sectionTitle` | 章節標題 |
| `countdown` | 倒計時 |
| `trackNumber` | 軌道編號 |

## 預設顏色 (12)

從彈窗底部的預設色板中一鍵應用顏色：

```
#4fc3f7 (cyan)   #80deea (light cyan)  #ff8a65 (orange)  #ffc107 (yellow)
#66bb6a (green)  #ef5350 (red)         #ab47bc (purple)  #ffffff (white)
#888888 (gray)   #555555 (dim)         #444444 (darker)  #333333 (darkest)
```

## 操作（點擊位置）

1. **點擊彈窗頂部的下拉框（帶 ▾）** → 在列表中**點擊**你想更改顏色的**編輯對象**（到站時間 / 列車名 / 軌道編號 等 — 上述 10 項）。
2. **點擊彈窗底部的預設顏色**，該顏色即立即應用到所選對象。
3. 如需還原，點擊**「重置當前」按鈕**（僅重置所選對象）或**「重置全部」按鈕**（重置全部 10 項）。

> [!NOTE]
> 本彈窗採用從 12 個預設中**點擊選取**的方式。帶色相輪與 HEX 輸入的完整[取色器](../management-computer/symbol-editor.md#color-picker)用於其他界面，如[線路編號編輯器](../management-computer/symbol-editor.md)。

## 按面管理

**點擊「↻ 前 / 後切換」按鈕**在前 / 後之間切換，可為每一面設置不同的顏色組合。  
也支持[批量應用](settings.md#batch-apply)（見[顯示器設置](settings.md#batch-apply)）。

## 相關

- [鐵路管理方塊](../railway-management.md)
- [顯示器設置](settings.md)
- [取色器（管理用計算機）](../management-computer/symbol-editor.md#color-picker)
