package lotto.domain.player.playermoney;

import lotto.domain.dto.LottoResultsDto;
import lotto.domain.player.Profit;

public class UsedMoney {
    private final int usedMoney;

    public UsedMoney(int usedMoney) {
        this.usedMoney = usedMoney;
    }

    public UsedMoney updateUsedMoney(int consumeMoney) {
        return new UsedMoney(usedMoney + consumeMoney);
    }

    public int getUsedMoney() {
        return usedMoney;
    }

    Profit calculateProfit(LottoResultsDto lottoResultsDto) {
        double totalLottoPrizeMoney = lottoResultsDto.getTotalLottoPrizeMoney();
        return new Profit((Math.round((totalLottoPrizeMoney / usedMoney) * 1000) / 10.0));
    }
}
