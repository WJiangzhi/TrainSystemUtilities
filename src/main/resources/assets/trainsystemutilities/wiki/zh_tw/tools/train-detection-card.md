---
title: 列車檢測卡
id: tools/train-detection-card
tags: [tool, item, detection]
---

# 列車檢測卡

```embed:item id=trainsystemutilities:train_detection_card size=48 label=true
```

一種**手持輔助卡**，將鐵軌上**單一特定點**記錄為"列車經過時觸發的位置"。
記錄的點用於[鐵路管理方塊](../railway-management.md)的[SAS 廣播](../railway-management/announcement.md)，作為"列車經過此點時播放廣播"的觸發條件。

[[TOC]]

## 持有 / 使用

此卡沒有專用的設定 GUI，只需**手持它、右鍵鐵軌、記錄一個點**即可。詳細條件（目標列車、廣播內容等）後續在**鐵路管理方塊的 GUI** 中設定。

1. **將列車檢測卡放入快捷欄並手持。**
2. **右鍵要記錄的鐵軌方塊（Create 的鐵軌）**（預設為**滑鼠右鍵**）。
   - 右鍵非鐵軌的方塊會顯示類似"這不是鐵軌"的提示，且不會記錄任何內容。
3. 記錄成功後，螢幕底部會顯示"已記錄點（座標）"。
4. 手持該卡時，將游標**懸停**可在**提示資訊**中檢視已記錄的座標。
5. **Shift + 右鍵**（潛行時右鍵）即可**清除**已記錄的點。

> [!NOTE]
> 此卡僅記錄**鐵軌上的一個點**。"檢測範圍（半徑）""目標列車篩選""觸發時機型別"等詳細條件**都不在卡上**。
> 請在將記錄好的卡插入鐵路管理方塊後，於[SAS 廣播設定](../railway-management/announcement.md)的 GUI 中調整這些內容。

## 操作一覽

| 操作 | 效果 |
|---|---|
| **右鍵**鐵軌 | 將該鐵軌點記錄為檢測點 |
| **Shift + 右鍵** | 清除已記錄的點 |
| 游標**懸停**於卡上 | 在提示資訊中檢視已記錄的座標 |

## 與鐵路管理方塊配合使用

記錄好的卡透過以下流程成為真正的觸發條件。

1. 按上述步驟記錄希望播放廣播的鐵軌點。
2. 右鍵開啟[鐵路管理方塊](../railway-management.md)，再開啟[SAS 廣播設定](../railway-management/announcement.md)。
3. 在廣播設定中，**將這張記錄好的卡插入檢測卡插槽**。
4. 此後，當列車經過所記錄的鐵軌點時，便會播放配置好的廣播。

## 整合

- 作為[SAS 廣播](../railway-management/announcement.md)的播放觸發（透過檢測點）

## 相關

- [鐵路管理方塊](../railway-management.md)
- [SAS 廣播設定](../railway-management/announcement.md)
- [車站範圍指定工具](station-range-tool.md)
