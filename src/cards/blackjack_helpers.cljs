(ns cards.blackjack-helpers)

(defn cards-from-hand [hand]
  (let [{:keys [card-1 card-2 hits]} hand]
    (vec (filter not-empty (flatten (conj [card-1] [card-2] hits))))))

(defn translate-rank-soft [rank]
  (cond (< rank 11) rank
        (< rank 14) 10
        (= rank 14) 11))

(defn translate-rank-hard [rank]
  (cond (< rank 11) rank
        (< rank 14) 10
        (= rank 14) 1))

(defn has-ace-p [hand]
  (some #(= (% :rank) 14) (cards-from-hand hand)))

(defn choose-value [soft hard]
  (if (<= soft 21) soft hard))

(defn value-sum [hand translater]
  (reduce + (map #(translater (% :rank)) (cards-from-hand hand))))

(defn value [hand]
  (let [soft (value-sum hand translate-rank-soft)
        hard (value-sum hand translate-rank-hard)]
    (if (has-ace-p hand) (choose-value soft hard) hard)))
