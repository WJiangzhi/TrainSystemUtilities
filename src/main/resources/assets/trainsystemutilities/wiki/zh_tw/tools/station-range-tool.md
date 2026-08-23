---
title: 車站範圍指定工具
id: tools/station-range-tool
tags: [tool, station]
---

# 車站範圍指定工具

```embed:item id=trainsystemutilities:station_range_tool size=48 label=true
```

![](bws:trainsystemutilities:wiki/screens/station-group-save__ja_jp.png)

一種透過指定兩點來將一片車站區域註冊為**車站組**的工具。
它可將多個鐵路管理方塊歸併為一個車站，從而一次性應用通用設定（顏色 / 設定 / 廣播）。

[[TOC]]

## 模式切換

此工具用 **Alt + 滑鼠滾輪**在三種模式間切換（手持時，當前模式會顯示在快捷欄上方）。

| 模式 | 行為 |
|---|---|
| 選擇（預設） | 左鍵點選範圍的兩個角，建立車站組 |
| GUI | 右鍵開啟車站組管理 GUI |
| 顯示 | 顯示世界中已有車站組的輪廓 |

## 用法（選擇模式）

1. 手持工具並**左鍵**點選車站區域的第一個角。
2. **左鍵**點選對角的另一個角。
3. 右鍵工具 → 彈出車站組儲存 GUI。
4. 輸入車站組名稱 → 回車儲存。

## 股道編號模式

儲存時可選擇一種**股道自動編號**模式：

| 模式 | 行為 |
|---|---|
| AUTO | 自動編號，內側 = 股道 1 |
| LEFT | 左邊緣 = 股道 1 |
| RIGHT | 右邊緣 = 股道 1 |

## 車站組管理

![](bws:trainsystemutilities:wiki/screens/station-group-manage__ja_jp.png)

用 **Alt + 滑鼠滾輪**將工具切換到 **GUI** 模式，然後**右鍵**開啟管理 GUI，在其中可對已儲存的車站組進行：
- 重新命名
- 刪除（帶確認對話方塊）
- 檢視成員車站

> [!NOTE]
> 車站組管理沒有命令，全部透過此工具的 GUI 模式完成。

![](bws:trainsystemutilities:wiki/screens/station-group-manage-delete__ja_jp.png)

## 車站組的使用場景

- [管理用計算機車站標籤頁](../management-computer/stations.md) 為該組分配線路符號
- [鐵路管理方塊批次應用](../railway-management/settings.md#batch-apply) 一次性為同一組內的全部成員應用設定
- [SAS 廣播](../railway-management/announcement.md) 的共享目的地（share）
- [自動售票機](../structure/ticket-vending-machine.md) 的**候選售票車站**（從[車票標籤頁](../management-computer/tickets.md)中的車站組裡選取）
- 識別**自動檢票閘機**所指向的車站
- [換乘查詢終端](transit-terminal.md) **路徑檢索**的目標（以車站組作為起訖點進行檢索）

> [!NOTE]
> 自動售票機、自動檢票閘機和換乘檢索都**以本工具建立的車站組作為共享資料引用。** 在使用它們之前，請先將目標車站註冊為車站組。

## 相關

- [鐵路管理方塊](../railway-management.md)
- [管理用計算機車站標籤頁](../management-computer/stations.md)
- [儲存卡](memory-card.md)
