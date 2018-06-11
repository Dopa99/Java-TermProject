package upbit;

import java.util.ArrayList;
import java.util.Arrays;

public class CoinList
{
	public enum Market
	{
		KRW, BTC, ETH, /*USDT*/
	}
	
	public enum CoinSymbol
	{
		BTC, ADA, EOS, TRX, STORM, IGNIS, XRP, GTO, XLM,
		SC, ETH, SNT, QTUM, BCC, NEO, SBD, ETC, ARDR, GRS,
		XMR, STEEM, GNT, ICX, LSK, XEM, POWR, MER, EMC2,
		STRAT, OMG, LTC, TIX, BTG, PIVX, MCO, WAVES, STORJ,
		DASH, KMD, VTC, MTL, REP, ARK, ZEC
	}
	
	public enum CoinNameKR
	{
		��Ʈ����, ���̴�, �̿���, Ʈ��, ����, �̱״Ͻ�, ����, ������, ���ڶ���,
		�þ�����, �̴�����, �������ͽ���Ʈ��ũ��ū, ����, ��Ʈ����ĳ��, �׿�, �����޷�, �̴�����Ŭ����, �ƴ�, �׷ν�������,
		��׷�, ����, ��, ������, ����ũ, �����ڳ�̹����Ʈ, �Ŀ�����, ��ť��, ���ν�Ÿ�̴�,
		��Ʈ��Ƽ��, ���̼���, ����Ʈ����, ���ƽ��, ��Ʈ���ΰ��, �Ǻ���, ����, ���̺�, ���丮��,
		���, �ڸ�, ��Ʈ����, ��Ż, ���, ��ũ, ��ĳ��
	}
	
	private ArrayList<CoinSymbol> listKRW;
	private ArrayList<CoinSymbol> listBTC;
	private ArrayList<CoinSymbol> listETH;
	
	public CoinList()
	{
		setListKRW(new ArrayList<CoinSymbol>(Arrays.asList(
				CoinSymbol.ADA, CoinSymbol.ARDR, CoinSymbol.ARK, CoinSymbol.BCC, CoinSymbol.BTC, CoinSymbol.BTG,
				CoinSymbol.DASH, CoinSymbol.EMC2, CoinSymbol.EOS, CoinSymbol.ETC, CoinSymbol.ETH, CoinSymbol.GNT, 
				CoinSymbol.GRS, CoinSymbol.GTO, CoinSymbol.ICX, CoinSymbol.IGNIS, CoinSymbol.KMD, CoinSymbol.LSK, 
				CoinSymbol.LTC, CoinSymbol.MCO, CoinSymbol.MER, CoinSymbol.MTL, CoinSymbol.NEO, CoinSymbol.OMG, 
				CoinSymbol.PIVX, CoinSymbol.POWR, CoinSymbol.QTUM, CoinSymbol.REP, CoinSymbol.SBD,CoinSymbol.SC,
				CoinSymbol.SNT, CoinSymbol.STEEM, CoinSymbol.STORJ, CoinSymbol.STORM,CoinSymbol.STRAT, CoinSymbol.TIX,
				CoinSymbol.TRX, CoinSymbol.VTC, CoinSymbol.WAVES, CoinSymbol.XEM,CoinSymbol.XLM, CoinSymbol.XMR, 
				CoinSymbol.XRP, CoinSymbol.ZEC
				)));
		
		
		listBTC = new ArrayList<CoinSymbol>();
		listETH = new ArrayList<CoinSymbol>();

	}

	
	//Getter, Setter
	public ArrayList<CoinSymbol> getListKRW()
	{
		return listKRW;
	}

	public void setListKRW(ArrayList<CoinSymbol> listKRW)
	{
		this.listKRW = listKRW;
	}
}
