package train.common.library;

import com.jcirmodelsquad.tcjcir.vehicles.locomotives.*;
import com.jcirmodelsquad.tcjcir.vehicles.rollingstock.AmfleetCab;
import com.jcirmodelsquad.tcjcir.vehicles.rollingstock.PCH120Coach;
import train.common.entity.rollingStock.*;

import java.util.List;

public enum EnumSounds {

	// TRAINCRAFT STEAM //
	locoCherepanov(EntityLocoSteamCherepanov.class, "steam_horn", 0.6F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, " ", 0),
	locoHeavySteam(EntityLocoSteamHeavy.class, "hancock_3chime", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, "steambell_4", 19),
	locoSteam(EntityLocoSteam4_4_0.class, "american_steam_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, "steambell_1", 22),
	locoA4(EntityLocoSteamMallardA4.class, "a4_whistle", 0.6F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, " ", 0),
	locoSteamBig(EntityLocoSteamHeavy.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, " ", 0),
	locoSteamBR01_DB(EntityLocoSteamBR01_DB.class, "german_steam_horn", 0.8F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, " ", 0),
	locoSteamBR80_DB(EntityLocoSteamBR80_DB.class, "german_steam_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, " ", 0),
	locoSteamEr_USSR(EntityLocoSteamEr_Ussr.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, " ", 0),
	locoSteamPannier(EntityLocoSteamPannier.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, " ", 0),
	locoSteamC41(EntityLocoSteamC41.class, "drgw_5chime", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, "steambell_3", 21),
	locoSteamC41080(EntityLocoSteamC41_080.class, "drgw_5chime", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, "steambell_3", 21),
	locoSteamfowler(EntityLocoSteamFowler.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, " ", 0),
	locoSteamberk765(EntityLocoSteamBerk765.class, "765_whistle", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, "nkp_bell", 14),
	locoSteamberk1225(EntityLocoSteamBerk1225.class, " ", 0.6F, "steam_run", 0.4F, 20, "steam_idle", 0.4F, 20, true, "steambell_1", 22, new String[] {"1225_whistle", "pe_whistle"}),
	locoSteamAlcoSC4(EntityLocoSteamAlcoSC4.class, " ", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, "steambell_3", 21, new String[] {"ebt_5chime", "lima_5chime"}),
	locoSteamS100UK(EntityLocoSteamUSATCUK.class, "german_steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, " ", 0),
	locoSteamS100US(EntityLocoSteamUSATCUS.class, "usarmy_3chime", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, "steambell_2", 22),
	locoSteamHallClass(EntityLocoSteamHallClass.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, " ", 0),
	locoSteamKingClass(EntityLocoSteamKingClass.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, " ", 0),
	locoSteamSouthern1102(EntityLocoSteamSouthern1102.class, "southern_3chime", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, "steambell_3", 21),
	locoSteamC41T(EntityLocoSteamC41T.class, "drgw_3chime", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, "steambell_3", 21),
	locoSteamForney(EntityLocoSteamForneyRed.class, "american_steam_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, "steambell_3", 21),
	locoSteamMogul(EntityLocoSteamMogulBlue.class, "american_steam_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, "steambell_3", 21),
	locoSteamSmall(EntityLocoSteamSmall.class, "steam_horn", 0.5F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, "steambell_3", 21),
	locoSteamShay(EntityLocoSteamShay.class, "lukenhimer_3chime", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, "steambell_1", 22),
	locoSteamClass62(EntityLocoSteamC62Class.class, "class62_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, " ", 0),
	locoSteamD51S(EntityLocoSteamD51.class, "class62_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, " ", 0),
	locoSteamD51L(EntityLocoSteamD51Long.class, "class62_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, " ", 0),
	locoSteamSnowPlow(EntityLocoSteamSnowPlow.class, "shay_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, " ", 0),
	locoSteamAdler(EntityLocoSteamAdler.class, "adler_whistle", 0.8F, "adler_run", 0.2F, 20, "adler_run", 0.2F, 20, true, " ", 0),
	locoSteamGS4(EntityLocoSteamGS4.class, "daylight_whistle", 0.8F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, "sp_bell", 2),
	locoSteamMILWClassA(EntityLocoSteamMILWClassA.class, "leslie_a125_1", 0.8F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, "steambell_1", 22),
	locoSteamAlice(EntityLocoSteamAlice0_4_0.class, "german_steam_horn", 0.8F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, " ", 0),
	locoSteamGLYN(EntityLocoSteamGLYN042T.class, "german_steam_horn", 0.8F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, " ", 0),
	locoSteamvb(EntityLocoSteam040VB.class, "adler_whistle", 0.8F, "adler_run", 0.2F, 20, "adler_run", 0.2F, 20, true, "steambell_1", 22),
	locoSteamvbShay(EntityLocoSteamVBShay.class, "shay_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, "steambell_1", 22),
	locoSteam262T(EntityLocoSteam262T.class, "german_steam_horn", 0.8F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, " ", 0),
	locoSteamClimax(EntityLocoSteamClimax.class, "crosby_3chime", 0.5F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, "steambell_1", 22),
	locoSteamCoranationClass(EntityLocoSteamCoranationClass.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, " ", 0),
	locoSteamLSSP7(EntityLocoSteamLSSP7.class, "american_steam_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, "steambell_1", 22),
	// TRAINCRAFT ELECTRICS //
	locoElectricVL10(EntityLocoElectricVL10.class, "vl10_horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false, " ", 0),
	locoElectricBR_E69(EntityLocoElectricBR_E69.class, "eu07_horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false, " ", 0),
	locoElectricMineTrain(EntityLocoElectricMinetrain.class, "tram_horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false, " ", 0),
	locoElectricHighSpeed(EntityLocoElectricHighSpeedZeroED.class, "high_speed_horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false, " ", 0),
	locoElectricSubwayNY(EntityLocoElectricTramNY.class, "subway_horn", 1F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false, " ", 0),
	locoElectricTramWood(EntityLocoElectricTramWood.class, "westinghouse_whistle_1", 1F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false, " ", 0),
	locoElectricIC4_DSB_MG(EntityLocoDieselIC4_DSB_MG.class, "mg_horn", 1F, "mg_run", 0.8F, 10, "mg_idle", 0.6F, 50, false, " ", 0),
	locoElectricSpeedGrey(EntityLocoElectricNewHighSpeed.class, "high_speed_horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false, " ", 0),
	locoElectricICE1(EntityLocoElectricICE1.class, "mg_horn", 1F, "mg_run", 0.8F, 10, "mg_idle", 0.6F, 50, false, " ", 0),
	locoElectricE10(EntityLocoElectricE10_DB.class, "mg_horn", 1F, "mg_run", 0.6F, 8, "mg_idle", 0.4F, 50, false, " ", 0),
	locoElectricBR185(EntityLocoElectricBR185.class, "mg_horn", 1F, "vl10_idle", 0.8F, 10, "vl10_idle", 0.6F, 50, false, " ", 0),
	locoElectricClass85(EntityLocoElectricClass85.class, "mg_horn", 1F, "vl10_idle", 0.8F, 10, "vl10_idle", 0.6F, 50, false, " ", 0),
	locoElectricE103(EntityLocoElectricE103.class, "mg_horn", 1F, "mg_run", 0.6F, 8, "mg_idle", 0.4F, 50, false, " ", 0),
	LocoElectricBP4(EntityLocoElectricBP4.class, "nathan_k5La_3", 0.8F, "vl10_idle", 0.65F, 40, "vl10_idle", 0.65F, 40, false, "emd_steelbell_4", 10),
	// TRAINCRAFT DIESELS //
	locoDieselFOLM1(EntityLocoDieselFOLM1.class, " ", 0.8F, "FM_38D_6_Notch8", 0.65F, 45, "FM_38D_6_Idle", 0.65F, 58, false, "alco_bronzebell_3", 18, new String[] {"nathan_p01235_1", "nathan_p01235_1", "nathan_k5lar_1"}),
	locoDieselFOLM1B(DieselFOLM1B.class, " ", 0.8F, "FM_38D_6_Notch8", 0.65F, 45, "FM_38D_6_Idle", 0.65F, 58, false, " ", 0),
	locoDieselCD742(EntityLocoDieselCD742.class, "742_horn", 0.8F, "742_motor_slow", 0.65F, 40, "742_motor", 0.65F, 40, false, " ", 0),
	locoDieselChME3(EntityLocoDieselChME3.class, "chme3_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false, " ", 0),
	locoDieselGP7Red(EntityLocoDieselGP7Red.class, "gp_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false, "emd_brassbell_1", 15),
	locoDieselGP13(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP13.class, "gp40_2_horn", 0.8F, "chme3_idle", 0.65F, 51, "chme3_idle", 0.65F, 40, false, "emd_steelbell_8", 13),
	locoDieselKof_DB(EntityLocoDieselKof_DB.class, "chme3_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false, " ", 0),
	locoDieselSD40(EntityLocoDieselSD40.class, "gp_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false, "emd_brassbell_1", 15),
	locoDieselWLs40(EntityLocoDieselWLs40.class, "vl10_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false, " ", 0),
	locoDieselBamboo(EntityLocoDieselBamboo.class, "gp_horn", 0F, "chme3_idle", 0.2F, 40, "chme3_idle", 0.1F, 40, false, " ", 0),
	locoDieselSD70(EntityLocoDieselSD70.class, "sd70_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false, "emd_brassbell_1", 15),
	locoDieselDD35A(EntityLocoDieselDD35A.class, "sd70_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false,  "emd_brassbell_1", 15),
	locoDieselShunter(EntityLocoDieselShunter.class, "br_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false, " ", 0),
	locoDieselV60_DB(EntityLocoDieselV60_DB.class, "v60_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false, " ", 0),
	locoDiesel44tonSwitcher(EntityLocoDiesel44TonSwitcher.class, "v60_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false, " ", 0),
	locoDieselF7(EntityLocoDieselEMDF7.class, "sd70_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false, " ", 0),
	locoDieselF3(EntityLocoDieselEMDF3.class, "sd70_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false, " ", 0),
	locoDieselDeltic(EntityLocoDieselDeltic.class, "br_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false, " ", 0),
	locoDieselClass66(EntityLocoDieselClass66.class, "br_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false, " ", 0),
	locoDieselCD151(EntityLocoElectricCD151.class,"mg_horn", 1F, "mg_run", 0.8F, 10, "mg_idle", 0.6F, 50, false, " ", 0),



	//JCTC Alco/MLW Diesels
	DieselC424(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselC424.class, " ", 2.5F, "ALCO_16_251C_Notch8", 0.5F, 52, "ALCO_16_251C_Idle", 0.5F, 69, false, "alco_bronzebell_2", 13, new String[] {"nathan_m3_1", "nathan_k3la_4", "nathan_m3_4", "nathan_m3h_1", "prime_920_2" }),
	DieselC425(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselC425.class, " ", 2.5F, "ALCO_16_251C_Notch8", 0.5F, 52, "ALCO_16_251C_Idle", 0.5F, 69, false, "alco_bronzebell_2", 13, new String[] {"leslie_s3l_2", "prime_920_1" }),
	DieselC415H(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselC415H.class, " ", 2.5F, "ALCO_8_251F_Notch8", 0.65F, 46, "ALCO_8_251F_Idle", 0.8F, 54, false, "alco_bronzebell_1", 9, new String[] {"leslie_s2m_1", "leslie_s2m_1", "leslie_rs3l_faulty_2", "nathan_p3_new_4", "nathan_p3_new_3", "leslie_rs3l_5" }),
	DieselC415L(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselC415L.class, "nathan_ms1", 2.5F, "ALCO_8_251F_Notch8", 0.65F, 46, "ALCO_8_251F_Idle", 0.8F, 54, false, "alco_bronzebell_1", 9),
	DieselC415S(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselC415S.class, " ", 2.5F, "ALCO_8_251F_Notch8", 0.65F, 46, "ALCO_8_251F_Idle", 0.8F, 54, false, "alco_bronzebell_1", 9, new String[] {"leslie_rs3k_1", "leslie_rs3l_faulty_1", "nathan_m3_2", "leslie_rs3k_3", "generic_horn_1" }),
	DieselC855a(DieselC855a.class, " ", 2.5F, "ALCO_12_251C_Notch8", 2.5F, 51, "ALCO_12_251C_Idle", 0.65F, 50, false, "alco_bronzebell_2", 13, new String[] {"leslie_rs3l_1", "prime_990_1", }),
	DieselC855b(DieselC855b.class, " ", 2.0F, "ALCO_12_251C_Notch8", 2.5F, 51, "ALCO_12_251C_Idle", 0.65F, 50, false, "alco_bronzebell_2", 13, new String[] {" ", "prime_920_4", }),
	DieselDH643(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselDH643.class, "nathan_p3_old_4", 2.5F, "ALCO_12_251C_Notch8", 0.65F, 51, "ALCO_12_251C_Idle", 0.65F, 50, false, "alco_bronzebell_2", 13),
	DieselHH600(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselHH660.class,"leslie_a125_1", 2.5F, "ALCO_6_531_Notch8", 0.7F, 69, "ALCO_6_531_Idle", 0.7F, 136, false, "alco_bronzebell_1", 9),
	DieselPA1(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselPA1.class," ", 2.5F, "ALCO_16_244_Notch8", 1F, 14, "ALCO_16_244_Idle", 1F, 28, false, "alco_bronzebell_3", 18, new String[] {"leslie_a200_dual_1", "leslie_rs3l_3", "leslie_a200_dual_1", "nathan_m5_3", "leslie_a200_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_rs3l_3", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_rs3l_3", "leslie_a200_1", "leslie_a200_dual_1", "leslie_rs3l_3"}),
	DieselPB1(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselPB1.class," ", 2.5F, "ALCO_16_244_Notch8", 1F, 14, "ALCO_16_244_Idle", 1F, 28, false, "alco_bronzebell_3", 18, new String[] {"leslie_a200_4", "leslie_a200_4", "leslie_a200_4", "leslie_a200_4", " ", "leslie_a200_4", "leslie_a200_4"}),
	DieselFA1(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselFA1.class," ", 2.5F, "ALCO_12_244_Notch8", 1F, 51, "ALCO_12_244_Idle", 1F, 47, false, "alco_bronzebell_3", 18, new String[] {"leslie_a200_dual_2", "leslie_a200_dual_2", "leslie_a200_dual_2", "leslie_a200_dual_2", "leslie_a200_dual_2", "leslie_a200_dual_2", "nathan_m3r_1", "nathan_m3r_1",}),
	DieselFB1(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselFB1.class," ", 2.5F, "ALCO_12_244_Notch8", 1F, 51, "ALCO_12_244_Idle", 1F, 47, false, "alco_bronzebell_3", 18, new String[] {"leslie_a200_4", "leslie_a200_4", "leslie_a200_4", "leslie_a200_4", " ", " ", }),
	DieselFA2(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselFA2.class," ", 2.5F, "ALCO_12_244_Notch8", 1F, 51, "ALCO_12_244_Idle", 1F, 47, false, "alco_bronzebell_3", 18, new String[] {"leslie_a200_dual_2", "leslie_a200_dual_2", "leslie_a200_dual_2", "leslie_a200_dual_2", "leslie_a200_dual_2", "leslie_a200_dual_2", "leslie_a200_dual_2", "leslie_a200_dual_2", "nathan_m3h_1", "nathan_m3h_1",}),
	DieselFB2(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselFB2.class," ", 2.5F, "ALCO_12_244_Notch8", 1F, 51, "ALCO_12_244_Idle", 1F, 47, false, "alco_bronzebell_3", 18, new String[] {"leslie_a200_4", "leslie_a200_4", "leslie_a200_4", " ", " ", "leslie_a200_4", "leslie_a200_4" }),
	DieselFA4(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselFPA4.class,"nathan_m3h_1", 2.5F, "ALCO_12_251C_Notch8", 0.65F, 51, "ALCO_12_251C_Idle", 0.65F, 50, false, "alco_bronzebell_3", 18),
	DieselFB4(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselFPB4.class,"leslie_a200_2", 2.5F,  "ALCO_12_251C_Notch8", 0.65F, 51, "ALCO_12_251C_Idle", 0.65F, 50, false, " ", 24),
	DieselM420(DieselM420.class, "nathan_m5_3", 2.5F, "ALCO_12_251C_Notch8", 0.45F, 51, "ALCO_12_251C_Idle", 0.45F, 50, false, "alco_bronzebell_3", 18),
	DieselM420B(DieselM420B.class, "leslie_a200_2", 0.9F, "ALCO_12_251C_Notch8", 0.45F, 51, "ALCO_12_251C_Idle", 0.45F, 50, false, "alco_bronzebell_3", 18),
	DieselRSD15(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselRSD15.class," ", 2.5F, "ALCO_16_244_Notch8", 1F, 14, "ALCO_16_244_Idle", 1F, 28, false, "alco_bronzebell_3", 18, new String[] {"nathan_m3_1", "nathan_m3_1", "generic_horn_1", "nathan_m5_1" }),
	DieselS2(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselS2.class, "leslie_a200_1", 1F, "ALCO_6_539T_Notch8", 0.50F, 34, "ALCO_6_539T_Idle", 0.65F, 58, true, "alco_bronzebell_1", 9),
	//JCTC Baldwin Diesels
	DieselVO1000(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselVO1000.class," ", 2.5F, "Baldwin_8VO_Notch8", 1F, 58, "Baldwin_8VO_Idle", 1F, 62, false, "baldwin_brassbell_1", 22, new String[] {"wabco_e2_1", "wabco_e2_1", "wabco_e2_1", "leslie_a125_1", "prime_990_1" }),
	//JCTC EMD Diesels
	DieselBeep(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselBeep.class,"leslie_s3lr", 2.5F, "EMD_16_567BC_Notch8", 0.7F, 47, "EMD_16_567BC_Idle", 0.7F, 54, false, "emd_brassbell_1", 15),
	DieselCF7angle(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselCF7angle.class, " ", 0.65F, "EMD_16_567BC_Notch8", 0.65F, 47, "EMD_16_567BC_Idle", 0.8F, 54, false, "emd_brassbell_1", 15, new String[] {"leslie_a200_dual_1", "leslie_rs3l_3", "leslie_s3l_3", "generic_horn_1", "prime_920_3", "leslie_s3l_1", "leslie_rs3l_4", "leslie_rs3k_3", "nathan_k3la_2", "leslie_rs3k_1", "leslie_rs3l_5", "leslie_rs3l_4", "nathan_k3la_4", "nathan_k3la_2", "nathan_m5_3", "generic_horn_1", "prime_990_2", "prime_920_6", "nathan_p3_faulty_1", "leslie_rs3l_5", "leslie_rs3l_3", "nathan_p3_old_2", "leslie_rs3l_faulty_2", "leslie_rs3k_faulty_2", "nathan_k3la_3", "nathan_k3la_2", "leslie_a200_dual_2", "nathan_k3la_5", "nathan_m3h_1", "nathan_k3la_1",  "leslie_a200_dual_1" , "leslie_rs5t_3" }),
	DieselCF7round(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselCF7round.class, " ", 0.65F, "EMD_16_567BC_Notch8", 0.65F, 47, "EMD_16_567BC_Idle", 0.8F, 54, false, "emd_brassbell_1", 15, new String[] {"leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "nathan_m3_4", "generic_horn_1", "nathan_m5_3", "prime_990_3", "leslie_rs3l_5", "nathan_k3l_1", "leslie_a200_triple_1", "leslie_s3l_2", "nathan_p3_new_4"  }),
	DieselCF7angle2(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselCF7angle2.class, " ", 1F, "EMD_16_567BC_Notch8", 0.65F, 47, "EMD_16_567BC_Idle", 0.8F, 54, false, "emd_brassbell_1", 15, new String[] {"leslie_rs3l_faulty_3", "leslie_rs3l_faulty_4", "leslie_rs3l_faulty_5", "nathan_m3h_faulty_1", "leslie_rs3l_faulty_2" }),
	DieselF3A(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselF3A.class, "wabco_e2_dual_1", 1F, "EMD_16_567B_Notch8", 0.45F, 45, "EMD_16_567B_Idle", 0.75F, 55, false, "emd_brassbell_2", 15),
	DieselF7A(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselF7A.class, " ", 1F, "EMD_16_567B_Notch8", 0.45F, 45, "EMD_16_567B_Idle", 0.75F, 55, false, "emd_brassbell_2", 15), //new String[] {"wabco_e2_dual_1", "wabco_e2_dual_1", "wabco_e2_dual_1", "wabco_e2_dual_1", "wabco_e2_dual_1", "wabco_e2_dual_1", "nathan_m3_6", "nathan_m3_3", "wabco_e2_dual_1", "leslie_s3l_1", "wabco_e2_dual_1", "leslie_a200_3", "leslie_a200_2", "wabco_e2_dual_1", "wabco_e2_dual_1", "leslie_rs5t_1", "prime_920_7", "nathan_m3r_1", "nathan_m3h_1", "wabco_e2_dual_1", "nathan_p3_old_4", "wabco_e2_dual_1", "wabco_e2_dual_1", "wabco_e2_dual_1", "wabco_e2_dual_1", "wabco_e2_dual_1"  }),
	DieselF7B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselF7B.class, " ", 1F, "EMD_16_567B_Notch8", 0.45F, 45, "EMD_16_567B_Idle", 0.75F, 55, false, "emd_brassbell_2", 15), //new String[] {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "wabco_e2_2", " ", " ", " ", " ", }),
	DieselFP7A(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselFP7A.class, " ", 1F, "EMD_16_567B_Notch8", 0.45F, 45, "EMD_16_567B_Idle", 0.75F, 55, false, "emd_brassbell_2", 15, new String[] {"nathan_m5_3", "generic_horn_1", "nathan_m5_4", "nathan_p3_new_3" }),
	DieselFP9A(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselFP9A.class, "nathan_m3h_2", 1F, "EMD_16_567B_Notch8", 0.45F, 45, "EMD_16_567B_Idle", 0.75F, 55, false, "emd_brassbell_2", 15),
	DieselEMDE7A(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselE7A.class, " ", 1F, "EMD_12_567A_Notch8", 0.45F, 53, "EMD_12_567A_Idle", 0.75F, 53, false, "emd_bronzebell_2", 13, new String[] {"leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "nathan_m3_3", "leslie_a200_dual_1", "leslie_a200_dual_1", "nathan_m3_5", "nathan_m3_5", "leslie_a200_dual_1", "nathan_m3_5", "nathan_m3_4", "nathan_m3_4", "nathan_m3_4", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "nathan_m3_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "nathan_m3_8", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1",  "nathan_m3_2" }),
	DieselEMDE7B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselE7B.class, " ", 1F, "EMD_12_567A_Notch8", 0.45F, 53, "EMD_12_567A_Idle", 0.75F, 53, false, "emd_bronzebell_2", 13),
	DieselE8A(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselE8A.class, " ", 1F, "EMD_12_567C_Notch8", 0.45F, 72, "EMD_12_567C_Idle", 0.75F, 62, false, "emd_bronzebell_2", 13,  new String[] {"nathan_p5_old_1", "leslie_rs5t_3", "leslie_a200_dual_2", "nathan_m5_3", "leslie_rs3l_3", "leslie_a200_dual_2", "leslie_rs5t_3", "nathan_m3h_1", "nathan_m3h_1", "leslie_a200_dual_2", "leslie_a200_dual_2", "nathan_p5_new_2", "nathan_m5_6", "nathan_m5_4", "leslie_rs3l_4", "leslie_rs3l_5" }),
	DieselE8B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselE8B.class, " ", 1F, "EMD_12_567C_Notch8", 0.45F, 72, "EMD_12_567C_Idle", 0.75F, 62, false, "emd_bronzebell_2", 13),
	DieselE9A(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselE9A.class, "nathan_m3r_2", 1F, "EMD_12_567C_Notch8", 0.45F, 72, "EMD_12_567C_Idle", 0.75F, 62, false, "emd_bronzebell_2", 13),
	DieselE9B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselE9B.class, " ", 1F, "EMD_12_567C_Notch8", 0.45F, 72, "EMD_12_567C_Idle", 0.75F, 62, false, "emd_bronzebell_2", 13),
	DieselCE8(DieselCE8.class, " ", 2.5F, "EMD_12_567C_Notch8", 0.45F, 72, "EMD_12_567C_Idle", 0.75F, 62, false, "emd_bronzebell_2", 13, new String[] {"generic_horn_1", "generic_horn_1", "buell_b5_3", "nathan_m3_4", "nathan_m5_"}),
	DieselF40PH(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselF40PH.class, "nathan_k5la_big_1", 1F, "EMD_16_645E3_Notch8", 0.9F, 51, "EMD_16_645E3_Notch3", 0.7F, 50, false, "emd_steelbell_4", 10),
	DieselF45(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselF45.class," ", 2.5F, "EMD_20_645E3_Notch8", 1F, 54, "EMD_20_645E3_Idle", 1F, 54, false, "emd_steelbell_3", 18, new String[] {"leslie_s3l_2", "leslie_rs3k_3", "leslie_s3l_1", "leslie_s3l_2", "leslie_s3l_3" }),
	DieselFP45(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselFP45.class," ", 2.5F, "EMD_20_645E3_Notch8", 1F, 54, "EMD_20_645E3_Idle", 1F, 54, false, "emd_steelbell_3", 18, new String[] {"leslie_s3l_2", "leslie_s3l_2", "leslie_rs3l_3", "leslie_rs5t_4" }),
	DieselGP7(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP7.class, " ", 1F, "EMD_16_567B_Notch8", 0.9F, 46, "EMD_16_567B_Idle", 0.7F, 55, false, "emd_brassbell_2", 15,  new String[] {"nathan_m3_5", "leslie_rs3k_1", "wabco_e2_2", "nathan_m3_4", "nathan_m3_4", "nathan_m3h_1", "leslie_s3l_3", "leslie_s3l_2", "leslie_a200_triple_1", "nathan_m3_6", "nathan_m3_4", "nathan_m3h_2", "leslie_a200_4", "leslie_a200_4", "generic_horn_1", "nathan_p2_1", "nathan_m5_5", "leslie_a200_1", "nathan_m3_5", "nathan_m3_5", "nathan_m3_3" }),
	DieselGP7old(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP7old.class, "nathan_m5", 1F, "EMD_16_567B_Notch8", 0.9F, 46, "EMD_16_567B_Idle", 0.7F, 55, false, "emd_brassbell_2", 15),
	DieselGP7b(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP7b.class, " ", 1F, "EMD_16_567B_Notch8", 0.9F, 46, "EMD_16_567B_Idle", 0.7F, 55, false, "emd_brassbell_2", 15, new String[] {" ", "wabco_e2_1", " ", " " }),
	DieselGP7u(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP7u.class, " ", 1F, "EMD_16_567B_Notch8", 0.9F, 46, "EMD_16_567B_Idle", 0.7F, 55, false, "emd_brassbell_2", 15,  new String[] {"generic_horn_1", "nathan_m3r_1", "nathan_m3_8", " " }),
	DieselARRGP7u(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP7f.class, " ", 1F, "EMD_16_567B_Notch8", 0.9F, 46, "EMD_16_567B_Idle", 0.7F, 55, false, "emd_brassbell_2", 15, new String[] {"nathan_p5_old_1", "nathan_p5_new_1", "nathan_p5_new_2", "generic_horn_1" }),
	DieselGP9(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP9.class, " ", 1F, "EMD_16_567C_Notch8", 0.9F, 54, "EMD_16_567C_Idle", 0.7F, 48, false, "emd_brassbell_1", 15, new String[] {"leslie_rs3k_1", "nathan_p3_new_1", "nathan_p3_new_2", "nathan_m5_4", "nathan_m5_4", "prime_990_4", "nathan_p3_old_4", "nathan_p3_faulty_1", "nathan_k3la_5", "nathan_k3la_2", "generic_horn_1", "nathan_kj24_1", "nathan_m3h_2", "wabco_e2_dual_1", "nathan_m3h_1", "nathan_m3_4", "nathan_m3_4", "nathan_m3_4", "nathan_m5_2"}),
	DieselGP9old(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP9old.class, " ", 1F, "EMD_16_567C_Notch8", 0.9F, 54, "EMD_16_567C_Idle", 0.7F, 48, false, "emd_brassbell_3", 22),
	DieselGP15(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP15.class," ", 2.5F, "EMD_12_645E_Notch8", 1F, 54, "EMD_12_645E_Idle", 1F, 54, false, "emd_steelbell_5", 15, new String[] {"nathan_k3la_5", "nathan_k3la_4", "prime_920_5", "nathan_p3_old_1", "nathan_k3la_2", "nathan_k3la_3" }),
	DieselGP30(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP30.class, " ", 0.8F, "EMD_16_567D3_Notch8", 0.65F, 55, "EMD_16_567D3_Idle", 0.65F, 47, false, "emd_steelbell_3", 18, new String[] {"leslie_s3l_2", "nathan_m3r_1", "wabco_e2_dual_1", "wabco_e2_dual_1", "prime_920_3", "leslie_s3l_3", "nathan_m5_5", "nathan_m3h_1", "wabco_e2_dual_1", "leslie_rs3l_5", "leslie_rs3l_4", "prime_990_1" }),
	DieselGP35(DieselGP35.class, " ", 0.8F, "EMD_16_567D3_Notch8", 0.65F, 55, "EMD_16_567D3_Idle", 0.65F, 47, false, "emd_steelbell_3", 18,  new String[] {"nathan_m3_3", "nathan_m3_3", "nathan_p5_old_1", "nathan_m5_5", "nathan_m5_2", "nathan_p3_old_4", "nathan_p3_old_4", "leslie_s3l_2", "generic_horn_1", "nathan_p3_new_4", "nathan_m3_3", "leslie_rs3l_3", "leslie_rs5t_3" }),
	DieselGP38(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP38.class, " ", 0.8F, "EMD_16_645E_Notch8", 0.55F, 53, "EMD_16_645E_Idle", 0.55F, 53, false, "emd_steelbell_3", 18, new String[] {"nathan_m3_3", "generic_horn_1", "leslie_rs3l_1", "leslie_rs3l_1", "prime_920_7", "nathan_k5la_wide_1", "nathan_j3_1", "nathan_k5la_raised_4", "nathan_p5_new_1", "nathan_k5la_hybrid_1", "nathan_k3la_3" }),
	DieselGP38dash2(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP38dash2.class, "nathan_k3la_3", 0.8F, "EMD_16_645E_Notch8", 0.55F, 53, "EMD_16_645E_Idle", 0.55F, 53, false, "emd_steelbell_3", 18),
	DieselGP38H3(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP38H3.class, "nathan_k5la_big_1", 1F, "EMD_16_645E3_Notch8", 0.9F, 51, "EMD_16_645E3_Idle", 0.7F, 40, false, "emd_steelbell_4", 10),
	DieselGP39(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP39.class, " ", 0.8F, "EMD_12_645E3_Notch8", 0.55F, 56, "EMD_12_645E3_Idle", 0.55F, 49, false, "emd_steelbell_5", 15, new String[] {"leslie_rs5t_3", "generic_horn_1", "leslie_rs5t_3", "nathan_j3_1", "nathan_p3_new_3"}),
	DieselGP40(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP40.class, " ", 0.8F, "EMD_16_645E3_Notch8", 0.55F, 51, "EMD_16_645E3_Idle", 0.55F, 40, false, "emd_steelbell_1", 15, new String[] {"nathan_p5_old_1", "nathan_p3_new_1", "leslie_rs5t_2", "generic_horn_1", "leslie_sl4t_3", "nathan_m5_3", "nathan_m5_5", "nathan_m5_3", "nathan_k5l_1", "leslie_rs3k_1", "nathan_p3_new_4", "nathan_m5_5", "nathan_k3la_3", "prime_920_4", "prime_990_3", "nathan_p5_old_1", "nathan_k5la_raised_1", "nathan_k5la_big_1", "nathan_k5la_hybrid_1", "nathan_p3_new_4" }),
	DieselGP40TC(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP40TC.class, "nathan_k5la_big_1", 1F, "EMD_16_645E3_Notch8", 0.9F, 51, "EMD_16_645E3_Idle", 0.7F, 40, false, "emd_steelbell_4", 10),
	DieselGP49(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP49.class, "nathan_p5_old_2", 0.8F, "EMD_12_645F3B_Notch8", 0.55F, 57, "EMD_12_645F3B_Idle", 0.55F, 53, false, "prime_speakerbell", 16),
	DieselSD9(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD9.class, " ", 2.5F, "EMD_16_567C_Notch8", 0.45F, 54, "EMD_16_567C_Idle", 0.75F, 48, false, "emd_brassbell_3", 23, new String[] {"leslie_rs3k_3", "leslie_rs3k_1", "leslie_rs3k_1", "wabco_e2_dual_1", "nathan_p01345_1", "nathan_k3la_3", "nathan_m3r_1", "nathan_m3r_2", "nathan_m3r_2", "prime_990_1", "prime_990_3"}),
	DieselSD38(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD38.class, " ", 0.8F, "EMD_16_645E_Notch8", 0.55F, 53, "EMD_16_645E_Idle", 0.55F, 53, false, "emd_steelbell_5", 15, new String[] {"leslie_rs3l_4", "leslie_rs5t_3", "leslie_rs3l_3", "nathan_p3_new_3", "leslie_rs3l_5", "nathan_p5_old_1", "lelsie_rs3k_3", "nathan_p3_new_1"}),
	DieselSD39(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD39.class, " ", 2.5F, "EMD_12_645E3_Notch8", 0.65F, 56, "EMD_12_645E3_Idle", 0.65F, 49, false, "emd_steelbell_1", 15, new String[] {"nathan_k3la_5", "generic_horn_1", "nathan_p01235_2", "nathan_m3h_3", "nathan_m3h_2", "nathan_m3h_1", "leslie_rs3k_1", "nathan_m3_7"}),
	DieselSD40(DieselSD40.class, " ", 2.5F, "EMD_16_645E3_Notch8", 0.65F, 51, "EMD_16_645E3_Idle", 0.8F, 40, false, "emd_steelbell_8", 23, new String[] {"leslie_s3l_3", "generic_horn_1", "leslie_rs3l_3", "nathan_p3_new_1", "nathan_k3la_5", "prime_990_2", "leslie_s3l_2"}),
	DieselSD40dash2(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD40dash2.class, " ", 2.5F, "EMD_16_645E3_Notch8", 0.65F, 51, "EMD_16_645E3_Idle", 0.8F, 40, false, "emd_steelbell_8", 13, new String[] {"leslie_s3l_3", "leslie_rs3k_1", "nathan_p5_old_1", "nathan_p5_new_2", "leslie_s3l_2", "nathan_k3la_2", "nathan_k3la_4", "leslie_rs3l_3", "leslie_rs3l_3", "leslie_rs3l_5", "nathan_p5_new_1", "leslie_s3l_1", "nathan_k5la_raised_3", "nathan_p5_new_1", "nathan_k5la_hybrid_1", "generic_horn_1", "nathan_k5l_2", "nathan_k5la_raised_4", "nathan_p3_new_3", "nathan_k5l_4", "leslie_sl4t_2", "leslie_rs5t_3", "leslie_s3l_1", "leslie_s3l_3", "nathan_m5_3", "nathan_m5_6", "nathan_k5la_wide_2"}),
	DieselSD40dash2B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD40dash2B.class, " ", 2.5F, "EMD_16_645E3_Notch8", 0.65F, 51, "EMD_16_645E3_Idle", 0.8F, 40, false, " ", 11),
	DieselSD40dash3(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD40dash3.class, "nathan_k5la_raised_3", 2.5F, "EMD_16_645E3_Notch8", 0.65F, 51, "EMD_16_645E3_Idle", 0.8F, 40, false, "emd_steelbell_8", 13),
	DieselSD40R(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD40R.class, " ", 2.5F, "EMD_16_645E3_Notch8", 0.65F, 51, "EMD_16_645E3_Idle", 0.8F, 40, false, "emd_steelbell_8", 13, new String[] {"nathan_p3_old_1", "nathan_p3_new_3", "generic_horn_1", "nathan_k3la_5"}),
	DieselSD40A(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD40A.class, " ", 2.5F, "EMD_16_645E3_Notch8", 0.65F, 51, "EMD_16_645E3_Idle", 0.8F, 40, false, "emd_steelbell_8", 13, new String[] {"nathan_p3_old_1", "buell_b5_4", "nathan_p5_new_4", "nathan_p5_new_6", "generic_horn_1"}),
	DieselSDP40(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSDP40.class, " ", 2.5F, "EMD_16_645E3_Notch8", 0.65F, 51, "EMD_16_645E3_Idle", 0.8F, 40, false, "emd_steelbell_8", 13, new String[] {"leslie_rs3k_1", "buell_b3_1", "nathan_j3_1", "nathan_p3_new_3", "generic_horn_1"}),
	DieselSD40Tdash2(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD40T2.class, " ", 2.5F, "EMD_16_645E3_Notch8", 0.65F, 51, "EMD_16_645E3_Idle", 0.8F, 40, false, "emd_steelbell_1", 15, new String[] {"nathan_m3h_3", "nathan_p3_old_4", "nathan_p3_old_1", "nathan_p3_new_2", "nathan_k3la_3", "generic_horn_2", "nathan_p3_old_5", "generic_horn_1", "buell_b5_1", "nathan_j3_2", "generic_horn_2", "leslie_s3l_3", "nathan_m5r_1", "prime_990_5", "prime_920_7"}),
	DieselSD45_SD45dash2(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD45dash2.class, " ", 2.5F, "EMD_20_645E3_Notch8", 0.65F, 54, "EMD_20_645E3_Idle", 0.65F, 54, false, "emd_steelbell_4", 10, new String[] {"leslie_rs3l_1", "nathan_m3r_2", "leslie_rs3k_1", "leslie_rs3l_1", "nathan_p3_old_4", "leslie_rs3l_3", "nathan_m3h_1", "nathan_m3h_2", "prime_920_5", "prime_920_2", "leslie_rs3l_5", "leslie_rs3l_5", "leslie_rs5t_4", "leslie_s3l_2", "leslie_s3l_1", "leslie_s3l_3", "nathan_k3la_5", "nathan_k3la_2", "nathan_k3la_3", "generic_horn_1", "generic_horn_1", "nathan_p3_old_2", "nathan_k5la_raised_2", "nathan_k3la_3"}),
	DieselSD45dash2B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD45dash2B.class, " ", 2.5F, "EMD_20_645E3_Notch8", 0.65F, 57, "EMD_20_645E3_Idle", 0.65F, 54, false, "emd_steelbell_4", 10),
	DieselSDP45(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSDP45.class, " ", 2.5F, "EMD_20_645E3_Notch8", 0.65F, 57, "EMD_20_645E3_Idle", 0.65F, 54, false, "emd_steelbell_4", 10, new String[] {"nathan_p3_old_1", "generic_horn_1"}),
	DieselSD70Mac(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD70Mac.class, " ", 2F, "EMD_16_710G3B_Notch8", 0.5F, 48, "EMD_16_710G3B_Idle", 0.5F, 47, false, "emd_steelbell_8", 13, new String[] {"nathan_k3la_4", "nathan_k3la_2", "nathan_k5la_wide_1", "nathan_k3la_3", "nathan_k5la_big_1", "nathan_k3la_5", "nathan_k5la_hybrid_1", "leslie_rs3k_3", "nathan_k3la_3", "nathan_k5la_raised_1", "nathan_p3_new_3", "nathan_k3la_5", "nathan_k5la_big_1", "leslie_rs3k_1"}),
	DieselSDL39(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSDL39.class, " ", 2F, "EMD_12_645E3_Notch8", 0.65F, 56, "EMD_12_645E3_Idle", 0.65F, 49, false, "prime_speakerbell", 21, new String[] {"prime_990_1", "prime_920_4", "prime_990_3", "prime_920_7"}),
	DieselSDP40F(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSDP40F.class, " ", 2.5F, "EMD_16_645E3_Notch8", 0.65F, 51, "EMD_16_645E3_Idle", 0.8F, 40, false, "emd_steelbell_4", 10, new String[] {"leslie_sl4t_1", "leslie_sl4t_2", "leslie_sl4t_3", "leslie_sl4t_4", "leslie_s3l_2"}),
	DieselSW1(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSW1.class, " ", 0.9F, "EMD_6_567A_Notch8", 0.45F, 52, "EMD_6_567A_Idle", 0.75F, 42, false, "emd_bronzebell_3", 16, new String[] {"leslie_a125_1", "leslie_a125_1", "leslie_a125_1", "leslie_a125_1", "leslie_a125_1", "leslie_a125_1", "leslie_a125_1", "nathan_k3la_2", "nathan_m3h_1", "leslie_rs3l_2", "leslie_rs3l_1", "leslie_a125_1", "nathan_kj24_1", "nathan_m3h_2"}),
	DieselSW8(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSW8.class, " ", 0.9F, "EMD_12_567B_Notch8", 0.45F, 28, "EMD_12_567B_Idle", 0.75F, 30, false, "emd_bronzebell_3", 16, new String[] {"nathan_k5la_wide_2", "generic_horn_2"}),
	DieselSW900(DieselSW900.class, " ", 1.25F, "EMD_12_567B_Notch8", 0.35F, 28, "EMD_12_567B_Idle", 0.45F, 30, false, "emd_bronzebell_3", 16, new String[] {"leslie_s2m_1", "leslie_s3l_1", "prime_990_5", "nathan_m3_8", "generic_horn_1", "leslie_s3l_2"}),
	DieselSW1000(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSW1000.class, "nathan_p5", 0.8F, "EMD_8_645E_Notch8", 0.65F, 48, "EMD_8_645E_Idle", 0.65F, 54, false, "emd_steelbell_8", 13, new String[] {"leslie_a125_1", "generic_horn_1", "nathan_m3h_1", "leslie_a125_1", "generic_horn_1", "buell_b3_1", "nathan_k3la_3" }),
	DieselSW1200(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSW1200.class, " ", 0.65F, "EMD_12_645E_Notch8", 0.65F, 54, "EMD_12_645E_Idle", 0.8F, 54, false, "emd_steelbell_4", 10, new String[] {"nathan_p3_old_3", "leslie_a200_1", "leslie_a125_1", "leslie_a125_1", "leslie_s3l_3", "leslie_a125_1", "leslie_a200_triple_1", "prime_920_4", "leslie_a125_1", "leslie_s2m_1", "leslie_s2m_1"}),
	DieselSW1500(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSW1500.class, " ", 0.65F, "EMD_12_645E_Notch8", 0.65F, 54, "EMD_12_645E_Idle", 0.8F, 54, false, "emd_steelbell_5", 15, new String[] {"nathan_p3_new_2", "generic_horn_1", "nathan_p3_old_1", "nathan_k3la_5", "leslie_a125_1", "leslie_a125_1", "nathan_k3la_3", "prime_920_3", "prime_990_4", "leslie_a125_1", "nathan_n3_1", "nathan_k5la_hybrid_1", "nathan_m3h_2", "leslie_a125_1", "nathan_k3la_2", "leslie_a125_1", "nathan_k3la_1", "nathan_k3l_1"}),
	//JCTC FM Diesels
	DieselH1044(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselH1044.class, " ", 10F, "FM_38D_6_Notch8", 0.65F, 45, "FM_38D_6_Idle", 0.45F, 58, false, "alco_bronzebell_3", 18,  new String[] {"hancock_airwhistle_1", "wabco_e2_1", "wabco_e2_1", "wabco_e2_1", "wabco_e2_1", "wabco_e2_1", "nathan_m3h_1", "wabco_e2_1", "nathan_k3la_1", "wabco_e2_1", "wabco_e2_1", "prime_990_4"}),
	DieselFMH16_66(DieselH16_66.class," ", 1F,"FM_38D_6_Notch8", 0.65F, 45, "FM_38D_6_Idle", 0.45F, 58, false,"alco_bronzebell_3", 18, new String[] {"wabco_e2_dual_1", "leslie_s3l_1", "leslie_s3l_1", "wabco_e2_dual_1", "wabco_e2_dual_1", "wabco_e2_dual_1", "wabco_e2_dual_1", "wabco_e2_dual_1", "wabco_e2_dual_1", "wabco_e2_dual_1", "nathan_p5_new_2", "leslie_s3l_3", "wabco_e2_dual_1"}),
	DieselFMH24_66(DieselH24_66.class," ", 1F,"FM_38D_6_Notch8", 0.65F, 45, "FM_38D_6_Idle", 0.45F, 58, false,"alco_bronzebell_3", 18, new String[] {"wabco_e2_dual_1", "leslie_s3l_2", "leslie_s3l_2", "wabco_e2_dual_1", "nathan_p5_new_4", "wabco_e2_dual_1", "leslie_a200_triple_1" }),
	DieselFMH24_66L(DieselH24_66L.class," ", 1F,"FM_38D_6_Notch8", 0.65F, 45, "FM_38D_6_Idle", 0.45F, 58, false,"alco_bronzebell_3", 18, new String[] {"leslie_s3l_3", "nathan_p5_new_3"}),
	//JCTC GE Diesels
	Diesel25Ton(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGE25Ton.class, "wabco_e2_3", 10F, "GE_HBI_600_Notch8", 0.5F, 80, "GE_HBI_600_Idle", 0.5F, 100, false, "ge_steelbell_1", 18),
	Diesel44Ton(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGE44Ton.class, " ", 10F, "CAT_8_D17000_Notch8", 0.5F, 52, "CAT_8_D17000_Idle", 0.5F, 40, false, "ge_steelbell_1", 18, new String[] {"hancock_airwhistle_1", "hancock_airwhistle_1", "generic_horn_1", "generic_horn_1", "wabco_e2_3", "nathan_k5la_wide_2", "nathan_k5la_wide_2", "nathan_p2_1", "nathan_p2_1", "wabco_e2_dual_1"}),
	DieselB23(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselB23.class, " ", 2.5F, "GE_7FDL_12_Notch8", 0.65F, 40, "GE_7FDL_12_Idle", 0.65F, 50, false, "ge_steelbell_1", 18, new String[] {"nathan_m3h_1", "nathan_p3_new_3", "nathan_p3_new_3", "prime_920_4", "prime_920_4", "generic_horn_1", "nathan_m5_5", "leslie_rs5t_3", "leslie_s3l_2", "nathan_p5_old_6", "nathan_p3_faulty_1"}),
	DieselB30(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselB30.class, " ", 2.5F, "GE_7FDL_16_Notch8", 0.65F, 52, "GE_7FDL_16_Idle", 0.65F, 51, false, "ge_steelbell_1", 18, new String[] {"leslie_rs3k_3", "leslie_s3l_3"}),
	DieselBoxcab23Ton(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselBoxcab23Ton.class, "nathan_kj24_1", 10F, "GE_HBI_600_Notch8", 0.5F, 15, "GE_HBI_600_Idle", 0.5F, 25, false, "ge_steelbell_1", 18),
	DieselDash839C(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselDash839C.class, " ", 2.5F, "GE_7FDL_16_Notch8", 0.65F, 52, "GE_7FDL_16_Idle", 0.65F, 51, false, "ge_steelbell_1", 18, new String[] {"leslie_s3l_1", "nathan_k5la_big_2", "nathan_p5_new_4", "nathan_k5l_2", "prime_990_2", "generic_horn_1"}),
	DieselDash840B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselDash840B.class, " ", 2.5F, "GE_7FDL_16_Notch8", 0.65F, 52, "GE_7FDL_16_Idle", 0.65F, 10, false, "ge_steelbell_1", 18, new String[] {"nathan_k5la_big_2", "leslie_s3l_1", "prime_990_2", "nathan_p3_new_3", "generic_horn_1", "nathan_p5_new_6", "leslie_s3l_3", "prime_920_2", "nathan_m5_5", "nathan_m5_3"}),
	DieselDash840BB(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselDash840BB.class, " ", 2.5F, "GE_7FDL_16_Notch8", 0.65F, 52, "GE_7FDL_16_Idle", 0.65F, 51, false, "ge_steelbell_1", 18),
	DieselDash840BW(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselDash840BW.class, " ", 2.5F, "GE_7FDL_16_Notch8", 0.65F, 52, "GE_7FDL_16_Idle", 0.65F, 51, false, "ge_steelbell_1", 18, new String[] {"leslie_s3l_1", "nathan_k3la_3", "prime_990_2"}),
	DieselDash840C(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselDash840C.class, " ", 2.5F, "GE_FDL16_Notch8", 0.5F, 23, "GE_FDL16_Idle", 0.5F, 103, false, "ge_steelbell_1", 18, new String[] {"nathan_k3l_1", "leslie_s3l_1", "nathan_p5_old_3", "nathan_p5_old_3", "leslie_s3l_3", "nathan_k3l_1", "nathan_k5l_3", "nathan_k5l_3"}),
	DieselDash9C44W(DieselDash944CW.class, " ", 2.5F, "GE_7FDL_16_Notch8", 1F, 52, "GE_7FDL_16_Idle", 1F, 50, false, "ge_steelbell_1", 18, new String[] {"nathan_k5lar_1", "nathan_k5lar_faulty_1", "generic_horn_1", "nathan_m3h_3", "nathan_k3la_4", "nathan_p3_new_3", "nathan_k3la_2", "nathan_k5l_1", "leslie_s3lr_1", "nathan_m5r_1", "nathan_k5lar_faulty_1", "nathan_k5hl_2", "leslie_s3lr_1", "nathan_k3la_4"}),
	DieselAC4400C(DieselAC4400C.class, "  ", 2.5F, "GE_7FDL_16_Notch8", 1F, 52, "GE_7FDL_16_Idle", 1F, 50, false, "ge_steelbell_1", 18, new String[]  {"nathan_m5_2", "generic_horn_1"}),
	DieselAC4400CW(DieselAC4400CW.class, "  ", 2.5F, "GE_7FDL_16_Notch8", 1F, 52, "GE_7FDL_16_Idle", 1F, 50, false, "ge_steelbell_1", 18, new String[] {"nathan_k5la_big_1", "nathan_k5l_2", "generic_horn_1"}),
	DieselES44(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselES44.class, "nathan_k5hll", 1F, "GE_GEVO_12_Notch8", 0.65F, 20, "GE_GEVO_12_Idle", 0.75F, 50, false, "graham_ebell", 14, new String[] {"nathan_k5hl_4", "nathan_k5hl_2", "nathan_k5hl_1", "nathan_k5hl_3", "nathan_k5hl_4", "nathan_k5hl_1", "nathan_k5hl_3", "nathan_k5hl_2"}),
	DieselP32(DieselP32.class, "nathan_k5la_big_1", 2.5F, "GE_7FDL_12_Notch8", 0.65F, 40, "GE_7FDL_12_Idle", 0.65F, 50, false, "ge_steelbell_2", 15),
	DieselP40(DieselP40.class, "nathan_k5la_big_1", 2.5F, "GE_7FDL_12_Notch8", 0.65F, 40, "GE_7FDL_12_Idle", 0.65F, 50, false, "ge_steelbell_2", 15),
	DieselP42(DieselP42.class, " ", 2.5F, "GE_7FDL_16_Notch8", 0.6F, 52, "GE_7FDL_16_Idle", 0.6F, 51, false, "ge_steelbell_1", 18, new String[] {"nathan_k5la_wide_3", "nathan_k5la_raised_3", "nathan_k5la_raised_3", "nathan_k5la_raised_3"}),
	DieselSF30C(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSF30C.class, "leslie_s3l_1", 2.5F, "GE_FDL16_Notch8", 0.5F, 23, "GE_FDL16_Idle", 0.5F, 103, false, "ge_steelbell_1", 18),
	DieselU18B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselU18B.class, " ", 2.5F, "GE_7FDL_8_Notch8", 0.25F, 40, "GE_7FDL_8_Idle", 0.35F, 50, false, "ge_steelbell_2", 15, new String[] {"nathan_m3h_1", "nathan_m3h_1", "leslie_s3l_1", "leslie_s3l_3", "generic_horn_1", "nathan_p5_new_4", "leslie_rs5t_3", "prime_920_7", "nathan_m3h_2", "leslie_a200_triple_1", "leslie_rs5t_1", "leslie_rs5t_2", "leslie_rs5t_4", "nathan_m3h_3", "leslie_rs3l_3", "leslie_rs3l_3", "nathan_m3_6", "nathan_p3_old_1", "nathan_p3_old_5", "leslie_s5t_1", "leslie_s5t_2", "leslie_rs5t_1", "leslie_rs5t_2", "leslie_rs5t_4", "leslie_rs3k_faulty_2" }),
	DieselU18BB(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselU18BB.class, " ", 2.5F, "GE_7FDL_8_Notch8", 0.25F, 40, "GE_7FDL_8_Idle", 0.35F, 50, false, "ge_steelbell_2", 15, new String[] {"prime_920_5", " ", "leslie_rs3k_faulty_1"}),
	DieselU18BW(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselU18BW.class, " ", 2.5F, "GE_7FDL_8_Notch8", 0.25F, 40, "GE_7FDL_8_Idle", 0.25F, 50, false, "ge_steelbell_2", 15, new String[] {"nathan_m5_4", "nathan_m5_4", "prime_990_3", "nathan_m5_5", "generic_horn_1", "leslie_a200_triple_1", "nathan_k5lar_faulty_1"}),
	DieselU18Balt(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselU18Balt.class, " ", 3F, "GE_7FDL_8_Notch8", 0.20F, 40, "GE_7FDL_8_Idle", 0.25F, 50, false, "ge_steelbell_2", 15, new String[] {"leslie_rs3l_3", "nathan_m3_6", "prime_920_7", "nathan_p3_old_1", "leslie_a200_triple_1", "leslie_a200_triple_1", "nathan_m3_6" }),
	DieselU23B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselU23B.class, " ", 2.5F, "GE_7FDL_12_Notch8", 0.65F, 40, "GE_7FDL_12_Idle", 0.65F, 50, false, "ge_steelbell_2", 15, new String[] {"leslie_rs3l_4", "nathan_m3h_1", "prime_990_3", "prime_990_5", "prime_920_2", "leslie_rs3l_3", "generic_horn_1", "nathan_m3r_1", "leslie_s3l_3", "nathan_m3_4", "nathan_p5_old_4", "leslie_s3l_1", "nathan_m5_3", "nathan_m5_6"}),
	DieselU23Bold(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselU23Bold.class, "leslie_s3lr_1", 2.5F, "GE_7FDL_12_Notch8", 0.65F, 40, "GE_7FDL_12_Idle", 0.65F, 50, false, "ge_steelbell_2", 15),
	DieselU25B(DieselU25B.class, " ", 2.5F, "GE_7FDL_16_Notch8", 0.6F, 52, "GE_7FDL_16_Idle", 0.6F, 51, false, "ge_steelbell_1", 18, new String[] {"leslie_rs3l_3", "generic_horn_1", "prime_920_5", "prime_990_5", "leslie_s3l_1", "leslie_s3l_1", "prime_920_2", "leslie_rs3k_1", "nathan_m3h_2", "leslie_s3l_2", "nathan_m3_8"}),
	DieselU30C(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselU30C.class, " ", 2.5F, "GE_7FDL_16_Notch8", 0.5F, 52, "GE_7FDL_16_Idle", 0.5F, 51, false, "ge_steelbell_1", 18, new String[] {"leslie_rs3k_1", "leslie_rs5t_2", "prime_990_4", "leslie_s3l_2", "leslie_s3l_1", "nathan_p5_new_2", "leslie_rs5t_2"}),
	DieselU36C(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselU36C.class, " ", 2.5F, "GE_7FDL_16_Notch8", 0.5F, 52, "GE_7FDL_16_Idle", 0.5F, 51, false, "ge_steelbell_1", 18, new String[] {"leslie_rs3l_3", "leslie_s3l_1", "leslie_s3l_1", "leslie_s3l_3", "prime_990_3"}),
	DieselU50(DieselU50.class, " ", 2.5F, "GE_7FDL_16_Notch8", 0.6F, 52, "GE_7FDL_16_Idle", 0.6F, 51, false, "ge_steelbell_1", 18, new String[] {"leslie_a200_dual_1", "nathan_p3_old_1", "prime_990_4", "generic_horn_1", "prime_990_4", "generic_horn_1", "nathan_p6_1", "nathan_p6_1", "leslie_rs3l_4"}),
	//JCTC MOW Diesels
	DieselHighrailTruck(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselHighrailTruck.class, "truck_horn", 0.8F, "GE_HBI_600_Notch8", 0.65F, 80, "GE_HBI_600_Idle", 0.65F, 100, false, " ", 0),
	DieselHighrailVan(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselHighrailVan.class, "truck_horn", 0.8F, "GE_HBI_600_Notch8", 0.65F, 80, "GE_HBI_600_Idle", 0.65F, 100, false, " ", 0),
	//JCTC Misc Manufactures
	Diesel3GS21B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselNRE3gs21b.class," ", 2.5F, "QSK19C_Notch8", 0.50F, 40, "QSK19C_Idle", 1.0F, 53, false, "ge_steelbell_2", 15, new String[] {"nathan_k3la_3", "nathan_k3la_2", "nathan_k3la_5", "nathan_k3la_5", "nathan_k3la_3"}),
	DieselKrautt(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselKrautt.class,"nathan_p3_old_4", 2.5F, "Maybach_MD870_16_Notch8", 1F, 52, "Maybach_MD870_16_Idle", 1F, 42, false, "ge_steelbell_1", 15),
	//JCTC Fictional Diesels
	DieselGP389W(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP38dash9W.class, "nathan_k5la_raised_4", 0.8F, "EMD_16_645E_Notch8", 0.55F, 53, "EMD_16_645E_Idle", 0.55F, 53, false, "emd_steelbell_4", 10),
	DieselFAFDL(DieselFAFDL.class," ", 0.8F, "GE_7FDL_12_Notch8", 0.65F, 40, "GE_7FDL_12_Idle", 0.65F, 50, false, "ge_steelbell_1", 18, new String[] {"prime_920_5", "generic_horn_1", "prime_990_3", "prime_920_7"}),
	DieselFBFDL(DieselFBFDL.class," ", 2.5F, "GE_7FDL_12_Notch8", 0.65F, 40, "GE_7FDL_12_Idle", 0.65F, 50, false, "ge_steelbell_1", 18, new String[] {"leslie_a200_2", "generic_horn_1", "leslie_a200_2", "leslie_a200_2"}),
	Dieselgtavthing(com.jcirmodelsquad.tcjcir.vehicles.locomotives.Dieselgtavthing.class,"leslie_s3_1", 1F, "EMD_16_567D3_Notch8", 0.9F, 55, "EMD_16_567D3_Idle", 0.7F, 47, false, "emd_steelbell_4", 10),
	DieselHustler(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselHustler.class, "wabco3bell", 1F, "Plymouth_V8_Notch8", 0.9F, 8, "Plymouth_V8_Idle", 0.7F, 50, false, "emd_bronzebell_3", 16),
	DieselILMC(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselILMC.class, "eu07_horn", 2.5F, "GE_HBI_600_Notch8", 0.65F, 80, "GE_HBI_600_Idle", 0.65F, 100, false, "emd_bronzebell_3", 16),
	DieselMP15DCW9(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselMP15DCW9.class,"leslie_rs3k_2", 2.5F, "EMD_12_645E_Notch8", 1F, 54, "EMD_12_645E_Idle", 1F, 54, false, "emd_steelbell_1", 17),
	DieselSB23E(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSB23E.class, " ", 2.5F, "GE_7FDL_12_Notch8", 0.65F, 40, "GE_7FDL_12_Idle", 0.65F, 50, false, "ge_steelbell_1", 18, new String[] {"generic_horn_1", "nathan_m5r_1", "nathan_m5r_2", "nathan_k3la_3", "nathan_m3_6", "leslie_s3lr_1"}),
	DieselSB23R(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSB23R.class, " ", 2.5F, "GE_7FDL_12_Notch8", 0.65F, 40, "GE_7FDL_12_Idle", 0.65F, 50, false, "ge_steelbell_2", 15, new String[] {"prime_990_3", "generic_horn_1", "nathan_m5_5", "nathan_m5_2", "buell_b3_1", "nathan_m3h_1", "nathan_m3h_3", "leslie_s3lr_1", "buell_b5_2"}),
	DieselU56(DieselU56.class, " ", 2.5F, "GE_7FDL_16_Notch8", 0.6F, 52, "GE_7FDL_16_Idle", 0.6F, 51, false, "ge_steelbell_1", 18, new String[] {"prime_920_3", "prime_920_2"}),
	//JCTC Electrics
	//
	//JCTC EMD Electrics
	ElectricGM6C(com.jcirmodelsquad.tcjcir.vehicles.locomotives.ElectricGM6C.class, "leslie_s3l_1", 2.5F, "MILW_Notch8", 0.65F, 40, "MILW_Idle", 0.65F, 50, false, "emd_brassbell_1", 15),
	//JCTC ALCO Electrics
	ElectricEF1(com.jcirmodelsquad.tcjcir.vehicles.locomotives.ElectricEF1.class, "wabco_e2_1", 2.5F, "MILW_Notch8", 0.65F, 40, "MILW_Idle", 0.65F, 50, false, "alco_bronzebell_3", 18),
	ElectricEF1B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.ElectricEF1B.class, " ", 0, "MILW_Notch8", 0.65F, 40, "MILW_Idle", 0.65F, 50, false, "alco_bronzebell_3", 18),
	ElectricEP1A(com.jcirmodelsquad.tcjcir.vehicles.locomotives.ElectricEP1A.class, "wabco_e2_1", 2.5F, "MILW_Notch8", 0.65F, 40, "MILW_Idle", 0.65F, 50, false, "alco_bronzebell_3", 18),
	//JCTC Fictional Electric
	ElectricILMA(com.jcirmodelsquad.tcjcir.vehicles.locomotives.ElectricILMA.class, "eu07_horn", 2.5F, "MILW_Notch8", 0.65F, 40, "MILW_Idle", 0.65F, 50, false, "alco_bronzebell_3", 18),
	ElectricILMB(com.jcirmodelsquad.tcjcir.vehicles.locomotives.ElectricILMB.class, "eu07_horn", 2.5F, "MILW_Notch8", 0.65F, 40, "MILW_Idle", 0.65F, 50, false, "alco_bronzebell_3", 18),
	ElectricJT7(com.jcirmodelsquad.tcjcir.vehicles.locomotives.ElectricJT7.class, " ", 2.5F, "MILW_Notch8", 0.65F, 40, "MILW_Idle", 0.65F, 50, false, "alco_bronzebell_3", 18, new String[] {"leslie_a200_3", "leslie_a200_triple_1"}),
	PCH100H(com.jcirmodelsquad.tcjcir.vehicles.locomotives.PCH100H.class, "nathan_p2_1", 1F, "pch100h_notch8", 0.6F, 8, "pch100h_idle", 0.4F, 50, false, "transonic_ebell", 11),
	PCH120Commute(PCH120Commute.class, "nathan_p2_1", 1F, "mg_run", 0.6F, 8, "mg_idle", 0.4F, 50, false, "transonic_ebell", 11, new String[] {"nathan_p2", "eu07_horn"}),
	TestControlCar(com.jcirmodelsquad.tcjcir.vehicles.rollingstock.TestControlCar.class, "nathan_p2_1", 1F, "mg_run", 0.6F, 8, "mg_idle", 0.4F, 50, false, " ", 0),
	//JCTC Other Electrics
	CQ310(ElectricCQ310PO.class, "subway_horn", 1F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false, " ", 0),
	KawasakiLRV(ElectricKawasakiLRV.class, "tram_bell", 1F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false, " ", 0),
	//JCTC Steam
	//
	//JCTC Baldwin Steam
	SteamSkook(com.jcirmodelsquad.tcjcir.vehicles.locomotives.SteamSkook.class,"skookum_whistle", 1F, "skookum_notch8", 0.9F, 8, "skookum_idle", 0.7F, 50, true, "steambell_4", 19),
	SteamBKno2a(SteamBKno2a.class," ", 1F, "skookum_notch8", 0.9F, 8, "skookum_idle", 0.7F, 50, true, " ",0),
	SteamBKno2b(SteamBKno2b.class,"hancock_3chime", 1F, "skookum_notch8", 0.9F, 8, "skookum_idle", 0.7F, 50, true, "steambell_4", 19),
	//JCTC Logging
	SteamVBShay(com.jcirmodelsquad.tcjcir.vehicles.locomotives.SteamVBShay2.class, "shay_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, "steambell_4", 21),
	Steam2TruckClimax(com.jcirmodelsquad.tcjcir.vehicles.locomotives.SteamClimaxNew.class, "shay_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, "steambell_4", 21),
	Steam3TruckShay(com.jcirmodelsquad.tcjcir.vehicles.locomotives.SteamShay3Truck.class, "shay_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, "steambell_4", 21),
	//JCTC Fictional Steam
	SteamPE(com.jcirmodelsquad.tcjcir.vehicles.locomotives.SteamPELoco.class, "pe_whistle", 2F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, "steambell_4", 19),
	SteamF01(com.jcirmodelsquad.tcjcir.vehicles.locomotives.SteamF01.class, "shay_horn", 0.8F, "steam_run", 0.2F, 20, "steam_idle2", 0.2F, 24, true, "steambell_4", 19),
	SteamP01a(SteamP01a.class, "shay_horn", 0.8F, "steam_run", 0.2F, 20, "steam_idle2", 0.2F, 24, true, "steambell_4", 19),
	SteamWCPBuckingBull(SteamBuckingBull.class, "hancock_3chime", 1F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, "steambell_1", 22),
	//JCTC Foreign Steam
	SteamC11(com.jcirmodelsquad.tcjcir.vehicles.locomotives.SteamC11.class, "jnr_3chime", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, " ", 0),
	//JCTC Meme Stuff
	BigMeme(com.jcirmodelsquad.tcjcir.vehicles.locomotives.BigMeme.class, "leslie_a425", 15, "aircompresser", 0.65F, 88, "aircompresser", 0.65F, 88, false, " ", 0),
	DieselHHGregg(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselHHgregg.class,"hhgregg600horn", 2.5F, "hhgregg600_run", 1F, 216, "hhgregg600_idle", 1F, 216, false, " ", 0),
	DieselTGVMobile(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselTGVmobile.class, "truck_horn", 1F, "GE_HBI_600_Notch8", 0.9F, 80, "GE_HBI_600_Idle", 0.7F, 100, false, " ", 0),
	SteamOnion(com.jcirmodelsquad.tcjcir.vehicles.locomotives.SteamOnion.class, "hancock_3chime", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, "steambell_3", 25),
	Thanos(com.jcirmodelsquad.tcjcir.vehicles.locomotives.Thanos.class, "thanos_horn", 5, "thanos_run", 0.65F, 82, "thanos_idle", 0.65F, 33, false, " ", 0),
	Toaster(ElectricAEM7.class, "aem7_horn", 1F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false, " ", 0),
    //JCTC Rolling Stock
	AmfleetCab(AmfleetCab.class, "nathan_k5La_3", 2.5F, " ", 0.65F, 51, " ", 0.65F, 50, false, " ", 24),
	;

	//for figuring out the length for a sound, find out the soundfiles actual length, move the decimal over to the right by 1, and then multiply by 2


	private Class entityClass;
	private String horn;
	private float hornVolume;
	private String run;
	private String idle;
	private float runVolume;
	private float idleVolume;
	private int runSoundLength;
	private int idleSoundLength;
	private boolean soundChangeWithSpeed;
	private String bell;
	private int bellLength;

	public String[] getHorns() {
		return horns;
	}

	public void setHorns(String[] horns) {
		this.horns = horns;
	}

	private String[] horns;
	/**
	 * Defines the Horn, Bell, Idle, and Run Sounds for Locomotives.
	 *
	 * @param entityClass
	 * @param horn
	 * @param hornVolume
	 * @param run
	 * @param runVolume
	 * @param runSoundLength
	 * @param idle
	 * @param idleVolume
	 * @param idleSoundLength
	 * @param soundChangeWithSpeed
	 * @param bell
	 */
	EnumSounds(Class entityClass, String horn, float hornVolume, String run, float runVolume, int runSoundLength, String idle, float idleVolume, int idleSoundLength, boolean soundChangeWithSpeed, String bell, int bellLength) {
		this.entityClass = entityClass;
		this.horn = horn;
		this.hornVolume = hornVolume;
		this.run = run;
		this.idle = idle;
		this.runVolume = runVolume;
		this.idleVolume = idleVolume;
		this.runSoundLength = runSoundLength;
		this.idleSoundLength = idleSoundLength;
		this.soundChangeWithSpeed = soundChangeWithSpeed;
		this.bell = bell;
		this.bellLength = bellLength;
	}

	EnumSounds(Class entityClass, String horn, float hornVolume, String run, float runVolume, int runSoundLength, String idle, float idleVolume, int idleSoundLength, boolean soundChangeWithSpeed, String bell, int bellLength, String[] horns) {
		this.entityClass = entityClass;
		this.horn = horn;
		this.hornVolume = hornVolume;
		this.run = run;
		this.idle = idle;
		this.runVolume = runVolume;
		this.idleVolume = idleVolume;
		this.runSoundLength = runSoundLength;
		this.idleSoundLength = idleSoundLength;
		this.soundChangeWithSpeed = soundChangeWithSpeed;
		this.bell = bell;
		this.bellLength = bellLength;
		this.horns = horns;
	}
/*
	/**
	 * Defines only the Horn, Idle, and Run Sounds for Locomotives as to not break stuff without bells.
	 *
	 * @param entityClass
	 * @param horn
	 * @param hornVolume
	 * @param run
	 * @param runVolume
	 * @param runSoundLenght
	 * @param idle
	 * @param idleVolume
	 * @param idleSoundLenght
	 * @param soundChangeWithSpeed
	 */
	/*private EnumSounds(Class entityClass, String horn, float hornVolume, String run, float runVolume, int runSoundLenght, String idle, float idleVolume, int idleSoundLenght, boolean soundChangeWithSpeed) {
		this.entityClass = entityClass;
		this.horn = horn;
		this.hornVolume = hornVolume;
		this.run = run;
		this.idle = idle;
		this.runVolume = runVolume;
		this.idleVolume = idleVolume;
		this.runSoundLenght = runSoundLenght;
		this.idleSoundLenght = idleSoundLenght;
		this.soundChangeWithSpeed = soundChangeWithSpeed;
	}*/

	public Class getEntityClass() {
		return entityClass;
	}

	public String getHornString() {
		return horn;
	}

	public String getRunString() {
		return run;
	}

	public String getIdleString() {
		return idle;
	}

	public Float getHornVolume() {
		return hornVolume;
	}

	public Float getRunVolume() {
		return runVolume;
	}

	public Float getIdleVolume() {
		return idleVolume;
	}

	public int getRunSoundLength() {
		return runSoundLength;
	}

	public int getIdleSoundLength() {
		return idleSoundLength;
	}

	public boolean getSoundChangeWithSpeed() {
		return soundChangeWithSpeed;
	}

	public String getBellString() {
		return bell;
	}

	public int getBellLength() {
		return bellLength;
	}
}
