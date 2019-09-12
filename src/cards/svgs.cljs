(ns cards.svgs)

(defn svg-of [suit]
  (case suit
    s [:svg {:class "spade" :viewBox [0 0 383 450]}
       [:path {:d ["M80.5664436" "449.367676 C129.648175" "448.22771 161.45742" "396.274979 175.99418" "293.509482 C159.439092" "318.228152 125.772717" "333.519967 87.8003681" "332.062024 C18.2209784" "318.157539 6.01130557" "285.265149 0.128493074" "253.657727 C-2.01697801" "212.037493 22.7050272" "167.807025 74.2945087" "120.966321 C148.901883" "53.2265056 187.807054" "13.294868 191.010022" "1.17140775 L191.007071" "0 C191.022938" "0.229897063 191.057029" "0.473988257 191.109343" "0.732273583 C191.165214" "0.473988257 191.199305" "0.229897063 191.215172" "0 L191.213011" "1.17439594 C194.421581" "13.3014285 233.326488" "53.2320701 307.927734" "120.966321 C359.517216" "167.807025 384.239221" "212.037493 382.09375" "253.657727 C376.210938" "285.265149 364.001265" "318.157539 294.421875" "332.062024 C256.449526" "333.519967 222.783151" "318.228152 206.228063" "293.509482 C220.764823" "396.274979 252.574069" "448.22771 301.655799" "449.367676 L80.5664436" "449.367676 Z"]}]]
    c [:svg {:class "club" :viewBox [0 0 1280 1280]}
       [:g [:path {:d ["M6210 12794 c-19 -2 -78 -9 -130 -15 -470 -53 -954 -260 -1350 -575 -108 -86 -335 -313 -424 -424 -415 -519 -646 -1177 -646 -1841 0 -749 276 -1472 957 -2507 56 -83 99 -152 96 -152 -3 0 -22 13 -42 29 -20 15 -90 64 -156 108 -460 306 -891 479 -1385 554 -175 27 -554 33 -705 11 -490 -71 -891 -234 -1265 -513 -729 -544 -1160 -1417 -1160 -2349 0 -932 431 -1805 1160 -2349 374 -279 777 -443 1265 -513 147 -21 492 -16 660 10 540 83 1041 298 1665 715 205 137 382 266 759 551 190 144 357 269 373 279 l28 19 0 -29 c0 -34 -34 -396 -55 -583 -138 -1232 -405 -1939 -921 -2440 -370 -359 -804 -578 -1514 -764 -48 -12 320 -14 2980 -14 2660 0 3028 2 2980 14 -710 186 -1144 405 -1514 764 -474 460 -734 1089 -880 2125 -41 289 -102 874 -94 911 2 12 31 -7 113 -76 322 -272 634 -509 915 -695 645 -428 1226 -670 1854 -772 618 -102 1311 83 1866 498 729 544 1160 1417 1160 2349 0 932 -431 1805 -1160 2349 -656 490 -1476 649 -2250 437 -352 -96 -706 -261 -1145 -531 -82 -51 -151 -92 -153 -90 -2 2 31 50 74 107 246 330 493 759 643 1114 240 571 363 1210 322 1673 -52 589 -275 1148 -637 1601 -89 111 -316 338 -424 424 -387 308 -827 500 -1315 572 -96 14 -472 27 -545 18z"]}]]]
    d [:svg {:class "diamond" :viewBox [0 0 3113 3603]}
       [:path {:d ["M1576.7-2.7l-15.4" "21.6c540" "752.2" "1091.8" "1327.5" "1550.8" "1776.5 c-465.8" "455.2-1028" "1040.8-1576.8" "1809.9l15.6-21.8l-16.2-22.5C1005.4" "2827.3" "465.6" "2263" "13.9" "1820.5L0.1" "1807 C461.1" "1356.4" "1016.6" "778.2" "1559.9" "20.8L1576.7-2.7z"]}]]
    h [:svg {:class "heart" :viewBox [0 0 1792 1792]}
       [:path {:d ["M896" "1664q-26" "0-44-18l-624-602q-10-8-27.5-26t-55.5-65.5-68-97.5-53.5-121-23.5-138q0-220" "127-344t351-124q62" "0" "126.5" "21.5t120" "58" "95.5" "68.5" "76" "68q36-36" "76-68t95.5-68.5" "120-58" "126.5-21.5q224" "0" "351" "124t127" "344q0" "221-229" "450l-623" "600q-18" "18-44" "18z"]}]]
    "default"))
