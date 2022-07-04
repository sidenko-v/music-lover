fun main() {

    val isMusicLover = true
    val discountFactor = 0.05
    val musicLoverDiscountFactor = 0.01
    val amount = 5000
    var discount: Int


    if (amount in 0..1000) {
        discount = 0
    } else if (amount in 1001..10_000) {
        discount = 100
    } else {
        discount = (amount * discountFactor).toInt()
    }

    if (isMusicLover) {
        discount = (discount + ((amount - discount) * musicLoverDiscountFactor)).toInt()
    }

    println("Скидка $discount рублей")


    //Важно: скидки не суммируются, а применяются сверху. Например, у пользователя скидка 5%, значит 1% применяется к 95%:


}