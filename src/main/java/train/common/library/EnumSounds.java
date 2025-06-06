package train.common.library;

import com.jcirmodelsquad.tcjcir.vehicles.locomotives.*;
import com.jcirmodelsquad.tcjcir.vehicles.rollingstock.AmfleetCab;
import com.jcirmodelsquad.tcjcir.vehicles.rollingstock.PCH120Coach;
import train.common.entity.rollingStock.*;

import java.util.List;

public enum EnumSounds {

    //TC DIESEL & ELECTRIC//
	locoDieselKof_DB(EntityLocoDieselKof_DB.class, "chme3_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false, " ", 0),
	locoDieselCD742(EntityLocoDieselCD742.class, "742_horn", 0.8F, "742_motor_slow", 0.65F, 40, "742_motor", 0.65F, 40, false, " ", 0),
	locoDieselChME3(EntityLocoDieselChME3.class, "chme3_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false, " ", 0),
	locoDieselGP7Red(EntityLocoDieselGP7Red.class, "gp_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false, "emd_brassbell_1", 15),
	locoDiesel44TonSwitcher(EntityLocoDiesel44TonSwitcher.class, "v60_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false, " ", 0),
	locoDieselSD40(EntityLocoDieselSD40.class, "gp_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false, "emd_brassbell_1", 15),
	locoDieselSD70(EntityLocoDieselSD70.class, "sd70_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false, "emd_brassbell_1", 15),
	locoDieselShunter(EntityLocoDieselShunter.class, "br_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false, " ", 0),
	locoDieselWLs40(EntityLocoDieselWLs40.class, "vl10_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false, " ", 0),
	locoDieselV60_DB(EntityLocoDieselV60_DB.class, "v60_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false, " ", 0),
	locoDieselF7(EntityLocoDieselEMDF7.class, "sd70_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false, " ", 0),
	locoDieselF3(EntityLocoDieselEMDF3.class, "sd70_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false, " ", 0),
	locoDieselDD35A(EntityLocoDieselDD35A.class, "sd70_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false,  "emd_brassbell_1", 15),
	locoDieselBamboo(EntityLocoDieselBamboo.class, "gp_horn", 0F, "chme3_idle", 0.2F, 40, "chme3_idle", 0.1F, 40, false, " ", 0),
	locoElectricE10_DB(EntityLocoElectricE10_DB.class, " ", 1F, "mg_run", 0.6F, 8, "mg_idle", 0.4F, 50, false, "emd_steelbell_8", 13, new String[] {"mg_horn", "mg_horn", "mg_horn", "mg_horn", "mg_horn", "nathan_k5la_small_1", "nathan_k5la_small_1", "nathan_k5la_small_1", "nathan_k5la_small_1", "nathan_k5la_small_1", "mg_horn",}),
	locoDieselCD151(EntityLocoElectricCD151.class,"mg_horn", 1F, "mg_run", 0.8F, 10, "mg_idle", 0.6F, 50, false, " ", 0),
	locoElectricE103(EntityLocoElectricE103.class, "mg_horn", 1F, "mg_run", 0.6F, 8, "mg_idle", 0.4F, 50, false, " ", 0),
	locoElectricVL10(EntityLocoElectricVL10.class, "vl10_horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false, " ", 0),
	locoElectricBR_E69(EntityLocoElectricBR_E69.class, "eu07_horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false, " ", 0),
	locoElectricMineTrain(EntityLocoElectricMinetrain.class, "tram_horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false, " ", 0),
	locoElectricHighSpeedZeroED(EntityLocoElectricHighSpeedZeroED.class, " ", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false, "graham_ebell", 14, new String[] {"high_speed_horn", "nathan_k5la_hybrid_2", "nathan_k5la_hybrid_2"}),
	locoElectricICE1(EntityLocoElectricICE1.class, "mg_horn", 1F, "mg_run", 0.8F, 10, "mg_idle", 0.6F, 50, false, " ", 0),
	locoElectricTramWood(EntityLocoElectricTramWood.class, "westinghouse_whistle_1", 1F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false, " ", 0),
	locoElectricTramNY(EntityLocoElectricTramNY.class, "subway_horn", 1F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false, " ", 0),
	locoElectricIC4_DSB_MG(EntityLocoDieselIC4_DSB_MG.class, "mg_horn", 1F, "mg_run", 0.8F, 10, "mg_idle", 0.6F, 50, false, " ", 0),
	locoElectricBR185(EntityLocoElectricBR185.class, " ", 1F, "vl10_idle", 0.8F, 10, "vl10_idle", 0.6F, 50, false, "graham_ebell", 14, new String[] {"mg_horn", "mg_horn", "mg_horn", "mg_horn", "mg_horn", "mg_horn", "mg_horn", "mg_horn", "mg_horn", "mg_horn", "mg_horn", "mg_horn", "mg_horn", "nathan_k5la_hybrid_2", "nathan_k5la_hybrid_2", "mg_horn"}),
	locoElectricClass85(EntityLocoElectricClass85.class, "mg_horn", 1F, "vl10_idle", 0.8F, 10, "vl10_idle", 0.6F, 50, false, " ", 0),
	locoElectricBP4(EntityLocoElectricBP4.class, "nathan_k5la_wide_3", 0.8F, "vl10_idle", 0.65F, 40, "vl10_idle", 0.65F, 40, false, "emd_steelbell_4", 10),
	locoDieselDeltic(EntityLocoDieselDeltic.class, "br_horn", 0.8F, "deltic_run", 0.65F, 62, "deltic_idle", 0.65F, 48, false, " ", 0),
	locoDieselClass66(EntityLocoDieselClass66.class, "br_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false, " ", 0),
	locoDieselFOLM1(EntityLocoDieselFOLM1.class, " ", 0.8F, "FM_38D_6_Notch8", 0.65F, 45, "FM_38D_6_Idle", 0.65F, 58, false, "alco_bronzebell_3", 18, new String[] {"nathan_p01235_1", "nathan_p01235_1", "nathan_k5lar_1"}),

	//TC STEAM//
	locoSteamCherepanov(EntityLocoSteamCherepanov.class, "steam_horn", 0.6F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, " ", 0),
	locoSteamPannier(EntityLocoSteamPannier.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, " ", 0),
	locoSteamC41(EntityLocoSteamC41.class, "drgw_5chime", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, "steambell_3", 21),
	locoSteamC41_080(EntityLocoSteamC41_080.class, "drgw_5chime", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, "steambell_3", 21),
	locoSteamAlcoSC4(EntityLocoSteamAlcoSC4.class, " ", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, "steambell_3", 21, new String[] {"ebt_5chime", "lima_5chime_1"}),
	locoSteamSouthern1102(EntityLocoSteamSouthern1102.class, "southern_3chime", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, "steambell_3", 21),
	locoSteamCoranationClass(EntityLocoSteamCoranationClass.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, " ", 0),
	locoSteamSATCUS(EntityLocoSteamUSATCUS.class, "usarmy_3chime", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, "steambell_2", 22),
	locoSteamSATCUK(EntityLocoSteamUSATCUK.class, "german_steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, " ", 0),
	locoSteamBR80_DB(EntityLocoSteamBR80_DB.class, "german_steam_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, " ", 0),
	locoSteam4_4_0(EntityLocoSteam4_4_0.class, "american_steam_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, "steambell_1", 22),
	locoSteamSmall(EntityLocoSteamSmall.class, " ", 0.5F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, "steambell_3", 21, new String[] {"steam_horn", "steam_horn", "steam_horn", "steam_horn", "steam_horn", "ttte_whistle"}),
	locoSteamLSSP7(EntityLocoSteamLSSP7.class, "american_steam_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, "steambell_1", 22),
	locoHeavySteamHeavy(EntityLocoSteamHeavy.class, "hancock_3chime", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, "steambell_1", 22),
	locoSteamC62(EntityLocoSteamC62Class.class, "class62_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, " ", 0),
	locoSteamD51(EntityLocoSteamD51.class, "class62_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, " ", 0),
	locoSteamD51Long(EntityLocoSteamD51Long.class, "class62_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, " ", 0),
	locoSteamBR01_DB(EntityLocoSteamBR01_DB.class, "german_steam_horn", 0.8F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, " ", 0),
	locoSteamGS4(EntityLocoSteamGS4.class, "daylight_whistle", 0.8F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, "sp_bell", 14),
	locoSteamEr_USSR(EntityLocoSteamEr_Ussr.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, " ", 0),
	locoSteamForneyRed(EntityLocoSteamForneyRed.class, "american_steam_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, "steambell_3", 21),
	locoSteamMogulBlue(EntityLocoSteamMogulBlue.class, "american_steam_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, "steambell_3", 21),
	locoSteamShay(EntityLocoSteamShay.class, "lukenhimer_3chime_1", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, "steambell_1", 22),
	locoSteamVBShay(EntityLocoSteamVBShay.class, "shay_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, "steambell_1", 22),
	locoSteamClimax(EntityLocoSteamClimax.class, "crosby_3chime_1", 0.5F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, "steambell_1", 22),
	locoSteamAdler(EntityLocoSteamAdler.class, "adler_whistle", 0.8F, "adler_run", 0.2F, 20, "adler_run", 0.2F, 20, true, " ", 0),
	locoSteamAlice0_4_0(EntityLocoSteamAlice0_4_0.class, "german_steam_horn", 0.8F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, " ", 0),
	locoSteam040VB(EntityLocoSteam040VB.class, "adler_whistle", 0.8F, "adler_run", 0.2F, 20, "adler_run", 0.2F, 20, true, "steambell_1", 22),
	locoSteamGLYN042T(EntityLocoSteamGLYN042T.class, "german_steam_horn", 0.8F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, " ", 0),
	locoSteam262T(EntityLocoSteam262T.class, "german_steam_horn", 0.8F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, " ", 0),
	locoMallardA4(EntityLocoSteamMallardA4.class, "a4_whistle", 0.6F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, " ", 0),
	locoSteamHallClass(EntityLocoSteamHallClass.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, " ", 0),
	locoSteamKingClass(EntityLocoSteamKingClass.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, " ", 0),
	locoSteamBerk1225(EntityLocoSteamBerk1225.class, " ", 0.6F, "steam_run", 0.4F, 20, "steam_idle", 0.4F, 20, true, "steambell_1", 22, new String[] {"1225_whistle", "pe_whistle"}),
	locoSteamBerk765(EntityLocoSteamBerk765.class, "765_whistle", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, "nkp_bell", 14),
	locoSteamMILWClassA(EntityLocoSteamMILWClassA.class, "leslie_a125_1", 0.8F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, "steambell_1", 22),
	locoSteamFowler(EntityLocoSteamFowler.class, "steam_horn", 0.6F, "steam_run", 0.4F, 20, "steam_run", 0.4F, 20, true, " ", 0),
	locoSteamSnowPlow(EntityLocoSteamSnowPlow.class, "shay_horn", 0.8F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, " ", 0),

	//TC OTHER//
	CF7_H_Angle(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselCF7_H_Angle.class, "gp40_2_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false, "emd_brassbell_1", 15),
	CF7_H_Round(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselCF7_H_Round.class, "gp_horn", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false, "emd_brassbell_1", 15),
	PCH100H(com.jcirmodelsquad.tcjcir.vehicles.locomotives.PCH100H.class, "nathan_p2_1", 1F, "pch100h_notch8", 0.45F, 8, "pch100h_idle", 0.45F, 50, false, "transonic_ebell", 11),
	DieselHighrailTruck(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselHighrailTruck.class, " ", 1F, "GE_HBI_600_Notch8", 0.45F, 80, "GE_HBI_600_Idle", 0.45F, 100, false, " ", 0, new String[] {"carhorn_1", "carhorn_1", "carhorn_1"}),
	TestControlCar(com.jcirmodelsquad.tcjcir.vehicles.rollingstock.TestControlCar.class, "nathan_p2_1", 1F, "mg_run", 0.45F, 8, "mg_idle", 0.45F, 50, false, " ", 0),
	DieselHighrailVan(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselHighrailVan.class, " ", 1F, "GE_HBI_600_Notch8", 0.45F, 80, "GE_HBI_600_Idle", 0.45F, 100, false, " ", 0, new String[] {"carhorn_1", "carhorn_1", "mexican_carhorn", "carhorn_1", "carhorn_1"}),

	//STEAM//
	SteamClimaxNew(com.jcirmodelsquad.tcjcir.vehicles.locomotives.SteamClimaxNew.class, "shay_horn", 1F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, "steambell_4", 21),
	SteamVBShay2(com.jcirmodelsquad.tcjcir.vehicles.locomotives.SteamVBShay2.class, "shay_horn", 1F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, "steambell_4", 21),
	SteamSkook(com.jcirmodelsquad.tcjcir.vehicles.locomotives.SteamSkook.class,"skookum_whistle", 1F, "skookum_notch8", 0.9F, 8, "skookum_idle", 0.7F, 50, true, "steambell_4", 19),
	Steam3Truck(com.jcirmodelsquad.tcjcir.vehicles.locomotives.SteamShay3Truck.class, "shay_horn", 1F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, "steambell_4", 21),
	SteamClimaxB(com.jcirmodelsquad.tcjcir.vehicles.locomotives.SteamClimaxB.class, " ", 1F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, "steambell_4", 19, new String[] {"shay_whistle_1", "shay_horn", "lukenhimer_3chime_2", "lukenhimer_3chime_2"}),
	SteamF01(com.jcirmodelsquad.tcjcir.vehicles.locomotives.SteamF01.class, "shay_horn", 1F, "steam_run", 0.2F, 20, "steam_idle2", 0.2F, 24, true, "steambell_4", 19),
	SteamP01a(com.jcirmodelsquad.tcjcir.vehicles.locomotives.SteamP01a.class, " ", 1F, "steam_run", 0.2F, 20, "steam_idle2", 0.2F, 24, true, "steambell_4", 19, new String[] {"shay_horn", "shay_horn", "usarmy_3chime"}),
	SteamBKno2a(com.jcirmodelsquad.tcjcir.vehicles.locomotives.SteamBKno2a.class," ", 1F, "skookum_notch8", 0.9F, 8, "skookum_idle", 0.7F, 50, true, " ",0),
	SteamBKno2b(com.jcirmodelsquad.tcjcir.vehicles.locomotives.SteamBKno2b.class,"hancock_3chime", 1F, "skookum_notch8", 0.9F, 8, "skookum_idle", 0.7F, 50, true, "steambell_4", 19),
	SteamWCPBuckingBull(com.jcirmodelsquad.tcjcir.vehicles.locomotives.SteamBuckingBull.class, "hancock_3chime", 1F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, "steambell_1", 22),
	SteamWCPMacky(com.jcirmodelsquad.tcjcir.vehicles.locomotives.SteamMacky.class, "dmir_yellowstone_whistle", 1F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, "steambell_1", 22),
	Steam2102(com.jcirmodelsquad.tcjcir.vehicles.locomotives.SteamAlco2102.class, " ", 1F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, "steambell_4", 19, new String[] {"generic_5chime_1", "crosby_3chime_2", "usarmy_3chime", "alco_5chime_1", "lima_5chime_2", "shay_whistle_1"}),
	SteamMK60(com.jcirmodelsquad.tcjcir.vehicles.locomotives.SteamMK60.class, " ", 1F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, "steambell_4", 19, new String[] {"generic_5chime_1", "lima_5chime_2", "wp_5chime_1", "wp_5chime_1", "wp_5chime_1", "wp_5chime_1", "wp_5chime_1", "dmir_yellowstone_whistle", "ebt_5chime", "lima_5chime_2"}),
	SteamPMNandN1(com.jcirmodelsquad.tcjcir.vehicles.locomotives.SteamPMNandN1.class, " ", 1F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, "steambell_3", 19, new String[] {"nathan_6chime_1", "cando_6chime_1", "nathan_6chime_1", "cando_6chime_1", "pe_whistle"}),
	SteamC11(com.jcirmodelsquad.tcjcir.vehicles.locomotives.SteamC11.class, "jnr_3chime", 1F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, " ", 0),
	SteamOnion(com.jcirmodelsquad.tcjcir.vehicles.locomotives.SteamOnion.class, "hancock_3chime", 1F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, "steambell_3", 25),
	SteamNP_L9(com.jcirmodelsquad.tcjcir.vehicles.locomotives.SteamNP_L9.class, "np_5chime_1", 1F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, "steambell_4", 19),
	SteamAlco460(com.jcirmodelsquad.tcjcir.vehicles.locomotives.SteamAlco460.class, " ", 1F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, "steambell_3", 19, new String[] {"generic_5chime_1", "nathan_5chime_1", "ri_5chime_1", "lemonwhistle", "ri_5chime_1", "ri_5chime_1"}),
	SteamPELoco(com.jcirmodelsquad.tcjcir.vehicles.locomotives.SteamPELoco.class, "pe_whistle", 1F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, "steambell_4", 19),
	SteamAlco0_6_0T(com.jcirmodelsquad.tcjcir.vehicles.locomotives.SteamAlco0_6_0T.class, " ", 1F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, "steambell_3", 19, new String[] {"american_steam_horn", "alco_5chime_1"}),
	SteamBrank(com.jcirmodelsquad.tcjcir.vehicles.locomotives.SteamBrank.class, " ", 1F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, "steambell_3", 19, new String[] {"lukenhimer_3chime_2"}),
	SteamLima2_8_0(com.jcirmodelsquad.tcjcir.vehicles.locomotives.SteamLima2_8_0.class, " ", 1F, "steam_run", 0.2F, 20, "steam_run", 0.2F, 20, true, "steambell_3", 19, new String[] {"generic_5chime_1", "lima_5chime_2", "lima_5chime_2", "lima_5chime_2", "american_steam_horn", "ri_5chime_1"}),

	//EMD//
	DieselF3A(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselF3A.class, " ", 1F, "EMD_16_567B_Notch8", 0.45F, 45, "EMD_16_567B_Idle", 0.45F, 55, false, "emd_brassbell_2", 15, new String[] {"wabco_e2_dual_1", "wabco_e2_dual_1", "nathan_m3h_1", "gp40_2_horn"}),
	DieselF7A(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselF7A.class, " ", 1F, "EMD_16_567B_Notch8", 0.45F, 45, "EMD_16_567B_Idle", 0.45F, 55, false, "emd_brassbell_2", 15, new String[] {"wabco_e2_dual_1", "wabco_e2_dual_1", "wabco_e2_dual_1", "wabco_e2_dual_1", "wabco_e2_dual_1", "wabco_e2_dual_1", "nathan_m3_6", "nathan_m3_3", "wabco_e2_dual_1", "leslie_s3l_1", "wabco_e2_dual_1", "leslie_a200_3", "leslie_a200_2", "wabco_e2_dual_1", "wabco_e2_dual_1", "leslie_rs5t_1", "nathan_m3r_1", "nathan_m3h_1", "wabco_e2_dual_1", "nathan_p3_old_4", "wabco_e2_dual_1", "wabco_e2_dual_1", "wabco_e2_dual_1", "wabco_e2_dual_1", "wabco_e2_dual_1", "wabco_e2_dual_1", "wabco_e2_dual_1"}),
	DieselF7B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselF7B.class, " ", 1F, "EMD_16_567B_Notch8", 0.45F, 45, "EMD_16_567B_Idle", 0.45F, 55, false, "emd_brassbell_2", 15, new String[] {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "wabco_e2_2", " ", " ", " ", " ", }),
	DieselF9A(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselF9A.class, " ", 1F, "EMD_16_567C_Notch8", 0.45F, 54, "EMD_16_567C_Idle", 0.45F, 48, false, "emd_brassbell_1", 15, new String[] {"leslie_rs3k_1", "nathan_m3h_3"}),
	DieselFP7A(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselFP7A.class, " ", 1F, "EMD_16_567B_Notch8", 0.45F, 45, "EMD_16_567B_Idle", 0.45F, 55, false, "emd_brassbell_2", 15, new String[] {"nathan_m5_3", "generic_horn_1", "nathan_m5_4", "nathan_m5_5", "nathan_m5_5", "leslie_rs3k_1", "leslie_a200_1"}),
	DieselFP9A(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselFP9A.class, "nathan_m3h_2", 1F, "EMD_16_567B_Notch8", 0.45F, 45, "EMD_16_567B_Idle", 0.45F, 55, false, "emd_brassbell_2", 15),
	DieselCF7angle(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselCF7angle.class, " ", 1F, "EMD_16_567BC_Notch8", 0.45F, 47, "EMD_16_567BC_Idle", 0.45F, 54, false, "emd_brassbell_1", 15, new String[] {"leslie_a200_dual_1", "leslie_rs3l_3", "leslie_s3l_3", "leslie_s3l_1", "leslie_rs3l_4", "leslie_rs3k_3", "nathan_k3la_2", "leslie_rs3k_1", "leslie_rs3l_5", "leslie_rs3l_4", "nathan_k3la_4", "nathan_k3la_2", "nathan_m5_3", "leslie_rs3l_3", "nathan_k3la_3", "nathan_k3la_2", "nathan_k3la_5", "leslie_s3l_1", "leslie_s3l_2", "nathan_k3la_4"}),
	DieselCF7round(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselCF7round.class, " ", 1F, "EMD_16_567BC_Notch8", 0.45F, 47, "EMD_16_567BC_Idle", 0.45F, 54, false, "emd_brassbell_1", 15, new String[] {"leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "generic_horn_1"}),
	DieselCF7round3(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselCF7round3.class, " ", 1F, "EMD_16_567BC_Notch8", 0.45F, 47, "EMD_16_567BC_Idle", 0.45F, 54, false, "emd_brassbell_1", 15, new String[] {"nathan_m5_3", "buell_b3_1", "prime_990_3", "nathan_m3_4", "nathan_k3l_1", "leslie_rs3l_3", "leslie_rs3l_5", "leslie_a200_triple_1","nathan_p3_new_4", "leslie_s3l_2"}),
	DieselCF7angle2(DieselCF7angle2.class, " ", 1F, "EMD_16_567BC_Notch8", 0.45F, 47, "EMD_16_567BC_Idle", 0.45F, 54, false, "emd_brassbell_1", 15, new String[] {"nathan_m3_2", "prime_920_2", "leslie_a200_dual_2", "leslie_a200_dual_1", "leslie_rs3l_4", "leslie_rs3l_1", "gp40_2_horn", "nathan_k3la_2", "leslie_rs3k_1", "leslie_rs3l_5", "leslie_a200_dual_2", "leslie_rs3k_2", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_2", "leslie_s3_1", "nathan_p3_old_2", "leslie_rs3l_faulty_1", "leslie_rs5t_2", "nathan_m3_4"}),
	DieselCF7angle3(DieselCF7angle3.class, " ", 1F, "EMD_16_567BC_Notch8", 0.45F, 47, "EMD_16_567BC_Idle", 0.45F, 54, false, "emd_brassbell_1", 15, new String[] {"nathan_m3_2", "prime_920_2", "leslie_a200_dual_2", "leslie_a200_dual_1", "leslie_rs3l_4", "leslie_rs3l_1", "gp40_2_horn", "nathan_k3la_2", "leslie_rs3k_1", "leslie_rs3l_5", "leslie_a200_dual_2", "leslie_rs3k_2", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_2", "leslie_s3_1", "nathan_p3_old_2", "leslie_rs3l_faulty_1", "leslie_rs5t_2", "nathan_m3_4", "prime_920_2", "leslie_rs3l_5"}),
	DieselCF7HH(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselCF7hh.class, "leslie_s5t_2", 1F, "EMD_16_567BC_Notch8", 0.45F, 47, "EMD_16_567BC_Idle", 0.45F, 54, false, "emd_brassbell_1", 15),
	DieselF40PH(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselF40PH.class, "nathan_k5la_big_1", 1F, "EMD_16_645E3_Notch8", 0.45F, 51, "EMD_16_645E3_Notch3", 0.7F, 50, false, "emd_steelbell_4", 10),
	DieselEMDE7A(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselE7A.class, " ", 1F, "EMD_12_567A_Notch8", 0.45F, 53, "EMD_12_567A_Idle", 0.45F, 53, false, "emd_bronzebell_2", 13, new String[] {"leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "nathan_m3_3", "leslie_a200_dual_1", "leslie_a200_dual_1", "nathan_m3_5", "nathan_m3_5", "leslie_a200_dual_1", "nathan_m3_5", "nathan_m3_4", "nathan_m3_4", "nathan_m3_4", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "nathan_m3_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "nathan_m3_8", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1",  "nathan_m3_2" }),
	DieselEMDE7B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselE7B.class, " ", 1F, "EMD_12_567A_Notch8", 0.45F, 53, "EMD_12_567A_Idle", 0.45F, 53, false, "emd_bronzebell_2", 13),
	DieselE8A(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselE8A.class, " ", 1F, "EMD_12_567C_Notch8", 0.45F, 72, "EMD_12_567C_Idle", 0.45F, 62, false, "emd_bronzebell_2", 13,  new String[] {"nathan_p5_old_1", "leslie_rs5t_3", "leslie_a200_dual_2", "nathan_m5_3", "leslie_rs3l_3", "leslie_a200_dual_2", "leslie_rs5t_3", "nathan_m3h_1", "nathan_m3h_1", "nathan_m3h_1", "leslie_a200_dual_2", "leslie_a200_dual_2", "nathan_p5_new_2", "nathan_m5_6", "nathan_m5_4", "leslie_rs3l_4", "leslie_rs3l_5", "leslie_a200_dual_2", "leslie_a200_dual_2", "leslie_a200_dual_2", "leslie_a200_dual_2"}),
	DieselE8B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselE8B.class, " ", 1F, "EMD_12_567C_Notch8", 0.45F, 72, "EMD_12_567C_Idle", 0.45F, 62, false, "emd_bronzebell_2", 13),
	DieselE9A(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselE9A.class, " ", 1F, "EMD_12_567C_Notch8", 0.45F, 72, "EMD_12_567C_Idle", 0.45F, 62, false, "emd_bronzebell_2", 13, new String[] {"nathan_m3r_2", "nathan_m3r_2", " "}),
	DieselE9B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselE9B.class, " ", 1F, "EMD_12_567C_Notch8", 0.45F, 72, "EMD_12_567C_Idle", 0.45F, 62, false, "emd_bronzebell_2", 13),
	DieselCE8(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselCE8.class, " ", 1F, "EMD_12_567C_Notch8", 0.45F, 72, "EMD_12_567C_Idle", 0.45F, 62, false, "emd_bronzebell_2", 13, new String[] {"buell_b5_3", "nathan_m3_4", "generic_horn_2", "generic_horn_2", "nathan_m5_3"}),
	DieselGP7(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP7.class, " ", 1F, "EMD_16_567B_Notch8", 0.45F, 46, "EMD_16_567B_Idle", 0.45F, 55, false, "emd_brassbell_2", 15,  new String[] {"nathan_m3_5", "leslie_rs3k_1", "wabco_e2_2", "nathan_m3_4", "nathan_m3_4", "nathan_m3h_1", "leslie_s3l_3", "leslie_s3l_2", "leslie_a200_triple_1", "nathan_m3_6", "nathan_m3_4", "walterwhite", "leslie_a200_4", "leslie_a200_4", "generic_horn_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_1", "nathan_m3_5", "nathan_m3_5", "nathan_m3_3", "nathan_m3h_4", "leslie_s3l_2", "wabco_e2_dual_1", "wabco_e2_dual_1", "wabco_e2_dual_1", "wabco_e2_dual_1", "buell_b3_1", "leslie_s3l_3", "wabco_e2_dual_1", "leslie_rs5t_2", "leslie_s3l_2", "nathan_m3_7", "nathan_m3_7", "nathan_p3_old_1", "nathan_p3_old_4", "nathan_p3_old_3", "nathan_m5_4", "leslie_rs3l_2", "leslie_a200_dual_1", "buell_b3_1", "nathan_m3_7", "leslie_rs3k_faulty_2"}),
	DieselGP7b(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP7b.class, " ", 1F, "EMD_16_567B_Notch8", 0.45F, 46, "EMD_16_567B_Idle", 0.45F, 55, false, "emd_brassbell_2", 15,  new String[] {" ", " ", "leslie_a200_1"}),
	DieselGP7u(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP7u.class, " ", 1F, "EMD_16_567B_Notch8", 0.45F, 46, "EMD_16_567B_Idle", 0.45F, 55, false, "emd_brassbell_2", 15,  new String[] {"leslie_s3l_3", "leslie_s3l_3", "generic_horn_1", "nathan_m3r_1", "nathan_m3_8", "leslie_s3l_2", "leslie_s3l_3", "prime_990_2"}),
	DieselGP7f(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP7f.class, " ", 1F, "EMD_16_567B_Notch8", 0.45F, 46, "EMD_16_567B_Idle", 0.45F, 55, false, "prime_speakerbell", 15, new String[] {"nathan_p5_old_1", "nathan_p5_new_1", "nathan_p5_new_2", "generic_horn_1", "leslie_s3l_4", "prime_990_5"}),
	DieselGPFDL(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGPFDL.class," ", 1F, "GE_7FDL_8_Notch8", 0.25F, 53, "GE_7FDL_8_Idle", 0.25F, 55, false, "ge_steelbell_1", 18, new String[] {"prime_920_5", "generic_horn_2", "nathan_m5_5", "nathan_m5_2"}),
	DieselGP9(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP9.class, " ", 1F, "EMD_16_567C_Notch8", 0.45F, 54, "EMD_16_567C_Idle", 0.45F, 48, false, "emd_brassbell_1", 15, new String[] {"leslie_rs3k_1", "nathan_p3_new_1", "nathan_p3_new_2", "nathan_m5_4", "nathan_m5_4", "prime_990_4", "nathan_p3_old_4", "leslie_rs5t_3", "nathan_k3la_5", "nathan_k3la_2", "generic_horn_1", "nathan_kj24_1", "nathan_m3h_2", "wabco_e2_dual_1", "nathan_m3h_1", "nathan_m3_4", "nathan_m3_4", "nathan_m3_7", "nathan_m3_8", "nathan_m3_4", "nathan_m3_4", "nathan_m5_2", "wabco_e2_dual_1", "wabco_e2_dual_1", "wabco_e2_dual_1", "wabco_e2_dual_1", "leslie_s3l_3", "leslie_s3l_3", "leslie_s3l_2", "leslie_rs3l_3", "nathan_m5_4", "nathan_m5_2", "nathan_p3_new_4", "nathan_p3_old_4", "leslie_rs3k_2", "leslie_rs3k_1", "leslie_rs3k_2", "leslie_rs3k_1", "nathan_p3_old_1", "nathan_p3_old_4", "nathan_p3_old_1", "nathan_p3_old_4", "leslie_s3l_3", "leslie_s3l_2", "nathan_m3h_1" ,"nathan_k3la_2", "nathan_p3_old_3", "nathan_m3h_1"}),
	DieselGP9b(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP9b.class, " ", 1F, "EMD_16_567C_Notch8", 0.45F, 54, "EMD_16_567C_Idle", 0.45F, 48, false, "emd_brassbell_1", 15),
	DieselGP13(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP13.class, "gp40_2_horn", 0.8F, "chme3_idle", 0.65F, 51, "chme3_idle", 0.65F, 40, false, "emd_steelbell_8", 13),
	DieselGP15(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP15.class," ", 1F, "EMD_12_645E_Notch8", 0.45F, 54, "EMD_12_645E_Idle", 0.45F, 54, false, "emd_steelbell_5", 15, new String[] {"nathan_k3la_5", "nathan_k3la_4", "nathan_p3_old_1", "nathan_k3la_2", "nathan_k3la_3" ,"nathan_k3la_3" , "leslie_rs5t_3", "leslie_rs3l_4", "leslie_rs3l_5", "leslie_rs3l_5", "leslie_rs3l_5", "leslie_rs3l_5"}),
	DieselGP18(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP18.class, " ", 1F, "EMD_16_567D1_Notch8", 0.45F, 54, "EMD_16_567D1_Idle", 0.45F, 49, false, "emd_brassbell_2", 15,  new String[] {"nathan_p3_old_1", "leslie_rs3k_1", "nathan_m5r_2", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "nathan_p5_old_4", "nathan_p3_old_4", "nathan_p3_old_1", "generic_horn_1", "generic_horn_1"}),
	DieselGP30(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP30.class, " ", 1F, "EMD_16_567D3_Notch8", 0.45F, 55, "EMD_16_567D3_Idle", 0.45F, 47, false, "emd_steelbell_3", 18, new String[] {"nathan_p5_old_1", "nathan_p5_old_3", "leslie_rs5t_3", "leslie_rs5t_3", "leslie_rs5t_3", "leslie_s3l_3", "nathan_m3h_1", "nathan_m5_5", "leslie_rs3l_3", "leslie_rs3k_1", "leslie_rs3k_3", "nathan_k3l_1", "nathan_p3_old_1", "nathan_j3_1", "leslie_s3l_1", "nathan_m3h_1", "generic_horn_1", "leslie_s3l_2", "nathan_m3_3", "nathan_m3h_1", "leslie_s3lr_1"}),
	DieselGP35(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP35.class, " ", 1F, "EMD_16_567D3_Notch8", 0.45F, 55, "EMD_16_567D3_Idle", 0.45F, 47, false, "emd_steelbell_3", 18,  new String[] {"nathan_m3_3", "nathan_m3_3", "nathan_p5_old_1", "nathan_m5_5", "nathan_m5_2", "nathan_p3_old_4", "nathan_p3_old_4", "leslie_s3l_2", "generic_horn_1", "nathan_p3_new_4", "nathan_k3la_3", "leslie_rs3l_3", "leslie_rs5t_3", "leslie_s3l_2", "nathan_m3_5", "nathan_m3_5", "leslie_s3l_2",  "buell_b3_1", "leslie_rs3l_2", "nathan_m3_3", "nathan_m3_3", "nathan_p5_old_6", "nathan_m3_3", "nathan_m3_3", "nathan_m3_3" ,"nathan_p5_old_6", "nathan_m3_3", "leslie_rs3k_3", "leslie_rs3k_3", "leslie_rs3l_2", "leslie_rs3l_2", "nathan_m3_3", "leslie_rs5t_3"}),
	DieselGP389W(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP38dash9W.class, "leslie_rs5t_3", 1F, "EMD_16_645E_Notch8", 0.45F, 53, "EMD_16_645E_Idle", 0.45F, 53, false, "emd_steelbell_4", 10),
	DieselGP38H3(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP38H3.class, "nathan_k5la_big_1", 1F, "EMD_16_645E3_Notch8", 0.45F, 51, "EMD_16_645E3_Idle", 0.45F, 40, false, "emd_steelbell_4",  10),
	DieselGP38(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP38.class, " ", 1F, "EMD_16_645E_Notch8", 0.45F, 53, "EMD_16_645E_Idle", 0.45F, 53, false, "emd_steelbell_3", 18, new String[] {"nathan_k5la_wide_1", "prime_920_7", "generic_horn_1","nathan_j3_1", "nathan_k5la_raised_4", "leslie_s3l_3", "leslie_s3l_3", "nathan_k3la_5", "leslie_s3l_2", "nathan_m3_3", "nathan_k5la_raised_4", "nathan_k5la_raised_4", "nathan_m3_3", "leslie_rs3l_2", "leslie_rs3l_2", "leslie_rs3l_2", "leslie_s3l_1", "leslie_s3l_1"}),
	DieselGP38dash2(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP38dash2.class, " ", 1F, "EMD_16_645E_Notch8", 0.45F, 53, "EMD_16_645E_Idle", 0.45F, 53, false, "emd_steelbell_3", 18, new String[] {"nathan_m3_3","leslie_rs3l_1", "leslie_rs3l_1", "nathan_k5la_raised_4", "nathan_p5_new_1", "nathan_k5la_hybrid_1", "nathan_k3la_5", "leslie_s3l_3", "prime_990_4", "prime_990_4", "nathan_m3_3" ,"nathan_k3la_5", "leslie_s3l_3"}),
	DieselGP39(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP39.class, " ", 1F, "EMD_12_645E3_Notch8", 0.45F, 56, "EMD_12_645E3_Idle", 0.45F, 49, false, "emd_steelbell_5", 15, new String[] {"leslie_rs3k_2", "generic_horn_1", "nathan_k5la_big_3"}),
	DieselGP39Dash2(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP39Dash2.class, " ", 1F, "EMD_12_645E3_Notch8", 0.45F, 56, "EMD_12_645E3_Idle", 0.45F, 49, false, "emd_steelbell_5", 15, new String[] {"leslie_rs5t_3", "leslie_rs5t_3", "nathan_j3_1", "nathan_p3_new_3", "nathan_k5la_raised_1"}),
	DieselGP39TDash2(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP39TDash2.class, " ", 1F, "EMD_12_645E3_Notch8", 0.45F, 56, "EMD_12_645E3_Idle", 0.45F, 49, false, "emd_steelbell_5", 15, new String[] {"leslie_rs5t_4"}),
	DieselGP39TDash2B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP39TDash2B.class, " ", 1F, "EMD_12_645E3_Notch8", 0.45F, 56, "EMD_12_645E3_Idle", 0.45F, 49, false, "emd_steelbell_5", 15, new String[] {"leslie_s2m_1"}),
	DieselGP40(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP40.class, " ", 1F, "EMD_16_645E3_Notch8", 0.45F, 51, "EMD_16_645E3_Idle", 0.45F, 40, false, "emd_steelbell_1", 15, new String[] {"nathan_p5_old_1", "nathan_p3_new_1", "leslie_rs5t_2", "generic_horn_1", "nathan_m5_3", "nathan_m5_3", "nathan_k5l_2", "leslie_rs3k_1", "leslie_rs3l_3", "nathan_k3la_3", "nathan_p3_new_4", "leslie_s3l_2", "leslie_s3l_2","nathan_m3_3", "nathan_m3h_2", "nathan_m3h_3",  "leslie_s3l_2", "prime_990_5", "prime_990_5", "nathan_m3h_1", "nathan_p3_old_4", "nathan_m3r_1"}),
	DieselGP40Dash2(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP40Dash2.class, " ", 1F, "EMD_16_645E3_Notch8", 0.45F, 51, "EMD_16_645E3_Idle", 0.45F, 40, false, "emd_steelbell_1", 15, new String[] {"leslie_s3l_3", "leslie_sl4t_3", "nathan_m5_5", "nathan_k5l_1", "leslie_rs5t_3", "nathan_m5_5", "nathan_m3_8", "nathan_k5la_raised_1", "nathan_k5la_big_1", "nathan_k5la_hybrid_1", "rtr_horn", "nathan_m3_3"}),
	DieselGP40TC(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP40TC.class, "nathan_k5la_big_1", 1F, "EMD_16_645E3_Notch8", 0.9F, 51, "EMD_16_645E3_Idle", 0.45F, 40, false, "emd_steelbell_4", 10),
	DieselGP49(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGP49.class, "nathan_p5_old_2", 1F, "EMD_12_645F3B_Notch8", 0.45F, 57, "EMD_12_645F3B_Idle", 0.45F, 53, false, "prime_speakerbell", 16),
	DieselSD9(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD9.class, " ", 1F, "EMD_16_567C_Notch8", 0.45F, 54, "EMD_16_567C_Idle", 0.45F, 48, false, "emd_brassbell_3", 23, new String[] {"nathan_p3_old_1", "nathan_p3_old_4", "wabco_e2_dual_1", "wabco_e2_dual_1", "nathan_j3_3", "generic_horn_1", "nathan_m3r_1", "nathan_m3h_1", "nathan_m3h_1", "nathan_p3_new_3", "wabco_e2_2", "leslie_a200_4", "nathan_m3r_1", "nathan_m3r_1"}),
	DieselSD38(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD38.class, " ", 1F, "EMD_16_645E_Notch8", 0.45F, 53, "EMD_16_645E_Idle", 0.45F, 53, false, "emd_steelbell_5", 15, new String[] {"leslie_rs3l_4", "leslie_rs5t_3", "leslie_rs3l_3", "nathan_p3_new_3", "leslie_rs3l_5", "nathan_p5_old_1", "leslie_rs3k_3", "nathan_p3_new_1", "nathan_k3la_4", "nathan_k5la_big_3", "nathan_k3la_4"}),
	DieselSD39(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD39.class, " ", 1F, "EMD_12_645E3_Notch8", 0.45F, 56, "EMD_12_645E3_Idle", 0.45F, 49, false, "emd_steelbell_1", 15, new String[] {"nathan_k3la_5", "generic_horn_1", "nathan_p01235_2", "nathan_m3h_3", "nathan_m3h_2", "nathan_m3h_1", "leslie_rs3k_1", "nathan_m3_7"}),
	DieselSDL39(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSDL39.class, " ", 1F, "EMD_12_645E3_Notch8", 0.45F, 56, "EMD_12_645E3_Idle", 0.45F, 49, false, "prime_speakerbell", 21, new String[] {"prime_990_1", "prime_920_4", "prime_990_3", "prime_920_7", "prime_920_5", "prime_990_4"}),
	DieselSD40(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD40.class, " ", 2.5F, "EMD_16_645E3_Notch8", 1F, 51, "EMD_16_645E3_Idle", 0.45F, 40, false, "emd_steelbell_8", 23, new String[] {"leslie_s3l_3", "generic_horn_1", "leslie_rs3l_3", "nathan_p3_new_1", "nathan_k3la_5", "prime_990_2", "leslie_s3l_2", "leslie_rs5t_3", "leslie_s3l_2", "nathan_k5la_wide_1"}),
	DieselSD40dash2(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD40dash2.class, " ", 1F, "EMD_16_645E3_Notch8", 0.45F, 51, "EMD_16_645E3_Idle", 0.45F, 40, false, "emd_steelbell_8", 13, new String[] {"leslie_s3l_3", "leslie_rs3k_1", "nathan_p5_old_1", "nathan_p5_new_2", "leslie_s3l_2", "nathan_k3la_2", "nathan_k3la_4", "leslie_rs3l_3", "leslie_rs3l_3", "leslie_rs3l_5", "nathan_p5_new_1", "leslie_s3l_1", "nathan_k5la_raised_3", "nathan_p5_new_1", "nathan_k5la_hybrid_1", "generic_horn_1", "nathan_k5l_2", "nathan_k5la_raised_4", "nathan_p3_new_3", "nathan_k5l_3", "leslie_sl4t_2", "leslie_rs5t_3", "leslie_s3l_1", "leslie_s3l_3", "leslie_rs5t_3", "leslie_rs5t_3", "nathan_k5la_wide_2", "nathan_k3la_5", "nathan_k5la_big_3", "nathan_m3_3", "nathan_k3la_5", "nathan_k3la_3", "leslie_s3l_3", "nathan_k5la_raised_4"}),
	DieselSD40T2(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD40T2.class, " ", 1F, "EMD_16_645E3_Notch8", 0.45F, 51, "EMD_16_645E3_Idle", 0.45F, 40, false, "emd_steelbell_1", 15, new String[] {"nathan_m3h_3", "nathan_p3_old_4", "nathan_p3_old_1", "nathan_p3_new_2", "nathan_k3la_3", "generic_horn_2", "nathan_p3_old_5", "generic_horn_1", "buell_b5_1", "nathan_j3_2", "generic_horn_2", "leslie_s3l_3", "nathan_m5r_1", "prime_920_1", "leslie_rs3l_5", "nathan_k3la_4", "nathan_p5_old_4", "br_horn", "br_horn", "br_horn"}),
	DieselSD40dash2B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD40dash2B.class, " ", 1F, "EMD_16_645E3_Notch8", 0.45F, 51, "EMD_16_645E3_Idle", 0.45F, 40, false, " ", 11),
	DieselSD40R(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD40R.class, " ", 1F, "EMD_16_645E3_Notch8", 0.45F, 51, "EMD_16_645E3_Idle", 0.45F, 40, false, "emd_steelbell_8", 13, new String[] {"nathan_p3_old_1", "nathan_p3_new_3", "generic_horn_1", "nathan_k3la_5"}),
	DieselSD40A(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD40A.class, " ", 1F, "EMD_16_645E3_Notch8", 0.45F, 51, "EMD_16_645E3_Idle", 0.45F, 40, false, "emd_steelbell_8", 13, new String[] {"nathan_p3_old_1", "buell_b5_4", "nathan_p5_new_4", "nathan_p5_new_6", "leslie_rs5t_4", "generic_horn_1"}),
	DieselSDP40(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSDP40.class, " ", 1F, "EMD_16_645E3_Notch8", 0.45F, 51, "EMD_16_645E3_Idle", 0.45F, 40, false, "emd_steelbell_8", 13, new String[] {"leslie_rs3k_1", "buell_b3_1", "nathan_j3_1", "nathan_p3_new_3", "generic_horn_1", "leslie_rs3k_3", "nathan_p5_new_4", "nathan_p3_old_1", "nathan_p3_old_1", "nathan_p5_old_4"}),
	DieselSDP40F(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSDP40F.class, " ", 1F, "EMD_16_645E3_Notch8", 0.45F, 51, "EMD_16_645E3_Idle", 0.45F, 40, false, "emd_steelbell_4", 10, new String[] {"leslie_sl4t_1", "leslie_sl4t_2", "leslie_sl4t_3", "leslie_sl4t_4", "leslie_s3l_2"}),
	DieselSD40dash3(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD40dash3.class, "nathan_k5la_raised_3", 1F, "EMD_16_645E3_Notch8", 0.45F, 51, "EMD_16_645E3_Idle", 0.45F, 40, false, "graham_ebell", 14),
	DieselSD45dash2(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD45dash2.class, " ", 1F, "EMD_20_645E3_Notch8", 0.45F, 54, "EMD_20_645E3_Idle", 0.45F, 54, false, "emd_steelbell_4", 10, new String[] {"leslie_rs3l_1", "nathan_m3r_2", "leslie_rs3k_1", "leslie_rs3l_1", "nathan_p3_old_4", "leslie_rs3l_3", "nathan_m3h_1", "nathan_m3h_2", "prime_920_5", "prime_920_2", "leslie_rs3l_5", "leslie_rs3l_5", "leslie_rs5t_4", "leslie_s3l_2", "leslie_s3l_1", "leslie_s3l_3", "nathan_k3la_5", "nathan_k3la_2", "nathan_k3la_3", "generic_horn_1", "generic_horn_1", "nathan_p3_old_2", "nathan_k5la_raised_2", "leslie_rs5t_3", "nathan_m3_3", "nathan_k5la_wide_1"}),
	DieselSD45dash2B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD45dash2B.class, " ", 1F, "EMD_20_645E3_Notch8", 0.45F, 57, "EMD_20_645E3_Idle", 0.45F, 54, false, "emd_steelbell_4", 10),
	DieselSDP45(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSDP45.class, " ", 1F, "EMD_20_645E3_Notch8", 0.45F, 57, "EMD_20_645E3_Idle", 0.45F, 54, false, "emd_steelbell_4", 10, new String[] {"nathan_p3_old_1", "generic_horn_1", "leslie_rs3k_3", "leslie_rs3k_3", "leslie_rs3k_3", "nathan_p5_old_4", "leslie_rs3k_3"}),
	DieselFP45(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselFP45.class," ", 1F, "EMD_20_645E3_Notch8", 0.45F, 54, "EMD_20_645E3_Idle", 0.45F, 54, false, "emd_steelbell_3", 18, new String[] {"leslie_s3l_2", "leslie_s3l_2", "leslie_rs3l_3", "leslie_rs5t_4" }),
	DieselF45(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselF45.class," ", 1F, "EMD_20_645E3_Notch8", 0.45F, 54, "EMD_20_645E3_Idle", 0.45F, 54, false, "emd_steelbell_3", 18, new String[] {"leslie_s3l_2", "leslie_rs3k_3", "leslie_s3l_1", "leslie_s3l_2", "leslie_s3l_3" }),
	DieselSD50(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD50.class, " ", 2.5F, "EMD_16_645F3B_Notch8", 1F, 55, "EMD_16_645F3B_Idle", 0.45F, 54, false, "emd_steelbell_8", 23, new String[] {"nathan_k5la_big_3", "nathan_k5la_big_3", "nathan_k5la_hybrid_1", "leslie_rs3l_3", "nathan_k5la_hybrid_1", "nathan_k5la_wide_2", "nathan_m3_5", "generic_horn_1", "leslie_s3l_3", "prime_990_2"}),
	DieselSD60(com .jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD60.class, " ", 2.5F, "EMD_16_710G3A_Notch8", 1F, 55, "EMD_16_710G3A_Idle", 0.45F, 48, false, "emd_steelbell_8", 23, new String[] {"nathan_k3la_5", "nathan_k3la_3", "nathan_p3_new_3", "leslie_rs3l_3", "nathan_k5la_hybrid_1", "leslie_s3l_3", "generic_horn_1", "nathan_m3_3", "leslie_rs3k_1", "leslie_rs5t_3", "nathan_p3_new_2", "nathan_p3_new_2"}),
	DieselSD70Mac(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD70Mac.class, " ", 1F, "EMD_16_710G3B_Notch8", 0.45F, 48, "EMD_16_710G3B_Idle", 0.45F, 47, false, "emd_steelbell_8", 13, new String[] {"nathan_k3la_4", "nathan_k3la_2", "nathan_k5la_wide_1", "nathan_k3la_3", "nathan_k5la_big_1", "nathan_k3la_5", "nathan_k5la_hybrid_1", "leslie_rs3k_3", "nathan_k3la_3", "leslie_rs5t_3", "nathan_p3_new_3", "nathan_k3la_5", "nathan_k5la_big_1", "leslie_rs3k_1"}),
	DieselSD70ACe(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD70ACe.class, " ", 1F, "EMD_16_710G3C_Notch8", 0.45F, 47, "EMD_16_710G3C_Idle", 0.45F, 45, false, "graham_ebell", 13, new String[] {"generic_horn_1", "nathan_k5lla_1", "nathan_k5lla_9", "nathan_k5lla_9", "nathan_k5lla_9", "nathan_k5lla_10", "nathan_k5lla_10", "nathan_k5lla_4", "nathan_k5lla_4", "nathan_k5lla_8", "nathan_k5lla_8", "nathan_k5lla_5", "nathan_k5lla_5", "nathan_k5lla_9", "nathan_k5lla_2", "nathan_k5lla_2", "nathan_k5lla_4", "nathan_k5lla_4"}),
	DieselSD70ACe_H(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSD70ACe_H.class, " ", 1F, "EMD_16_710G3C_Notch8", 0.45F, 47, "EMD_16_710G3C_Idle", 0.45F, 45, false, "graham_ebell", 13, new String[] {"heylouis", "nathan_k5lla_7", "nathan_k5lla_6", "nathan_k5lla_8", "nathan_k5lla_5", "nathan_k5lla_3", "nathan_k5lla_2", "nathan_k5lla_9", "nathan_k5lla_10", "nathan_k5lla_4", "nathan_k5lla_1"}),
	DieselSW1(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSW1.class, " ", 1F, "EMD_6_567A_Notch8", 0.45F, 52, "EMD_6_567A_Idle", 0.45F, 42, false, "emd_bronzebell_3", 16, new String[] {"leslie_a125_1", "leslie_a125_1", "leslie_a125_1", "leslie_a125_1", "leslie_a125_1", "leslie_a125_1", "leslie_a125_1", "nathan_k3la_2", "nathan_m3h_1", "leslie_rs3l_2", "leslie_rs3l_1", "leslie_a125_1", "nathan_kj24_1", "nathan_m3h_2", "leslie_a125_1", "leslie_a125_1", "leslie_a125_1", "leslie_rs3l_3", "nathan_m3_3", "leslie_a200_1", "nathan_j3_1", "leslie_rs3l_1"}),
	DieselSW8(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSW8.class, " ", 1F, "EMD_8_567C_Notch8", 0.45F, 28, "EMD_8_567C_Idle", 0.45F, 30, false, "emd_bronzebell_3", 16, new String[] {"nathan_k5la_wide_2", "generic_horn_2", "leslie_a125_1", "leslie_a125_1", "nathan_k5la_wide_2", "leslie_a125_1", "leslie_a125_1"}),
	DieselSW9(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSW9.class, " ", 1F, "EMD_12_567B_Notch8", 0.45F, 28, "EMD_12_567B_Idle", 0.45F, 30, false, "emd_bronzebell_3", 16, new String[] {"nathan_m5_6", "nathan_m5_3", "nathan_m5_5", "leslie_a125_1", "nathan_m5r_2", "generic_horn_1"}),
	DieselSW10(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSW10.class, " ", 1F, "EMD_12_645E_Notch8", 0.45F, 49, "EMD_12_645E_Idle", 0.45F, 46, false, "emd_steelbell_1", 15, new String[] {"leslie_s3l_2", "generic_horn_2", "prime_990_5", "nathan_k3l_1", "leslie_s2m_1", "leslie_s2m_1", "nathan_m3_3"}),
	DieselSW900(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSW900.class, " ", 1F, "EMD_8_567C_Notch8", 0.45F, 28, "EMD_8_567C_Idle", 0.45F, 30, false, "emd_steelbell_1", 15,  new String[] {"leslie_s2m_1", "leslie_s3l_1", "nathan_m3_8", "generic_horn_1", "leslie_s3l_2", "leslie_a125_1", "leslie_a125_1", "nathan_m3_3", "leslie_s3l_3", "nathan_j3_3", "prime_920_4"}),
	DieselSW1000(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSW1000.class, " ", 1F, "EMD_8_645E_Notch8", 0.45F, 48, "EMD_8_645E_Idle", 0.45F, 54, false, "emd_steelbell_8", 13, new String[] {"leslie_a125_1", "generic_horn_1", "nathan_m3h_1", "leslie_a125_1", "nathan_p3_new_3", "nathan_k3la_5", "nathan_k3la_2", "nathan_k3la_3", "leslie_rs3l_2", "leslie_rs3l_2"}),
	DieselSW1200(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSW1200.class, " ", 1F, "EMD_12_645E_Notch8", 0.45F, 54, "EMD_12_645E_Idle", 0.45F, 54, false, "emd_steelbell_4", 10, new String[] {"leslie_s3l_3", "leslie_a125_1", "leslie_a125_1", "leslie_a125_1", "leslie_a125_1", "leslie_a125_1", "prime_920_4", "leslie_a125_1", "leslie_a125_1", "leslie_s2m_1", "leslie_a200_triple_1", "generic_horn_1"}),
	DieselSW1500(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSW1500.class, " ", 1F, "EMD_12_645E_Notch8", 0.45F, 54, "EMD_12_645E_Idle", 0.45F, 54, false, "emd_steelbell_5", 15, new String[] {"nathan_p3_new_2", "generic_horn_1", "nathan_p3_old_1", "nathan_j3_1", "leslie_a125_1", "leslie_a125_1", "nathan_k3la_3", "prime_920_3", "prime_990_4", "leslie_a125_1", "nathan_n3_1", "nathan_k5la_hybrid_1", "nathan_m3h_2", "leslie_rs5t_3", "leslie_rs5t_3", "nathan_k3la_2", "leslie_a125_1", "nathan_k3la_1", "nathan_k3l_1", "nathan_m5_4", "nathan_p3_new_3", "leslie_s3l_4", "nathan_k3la_3", "nathan_k3la_5", "nathan_m3_7"}),
	DieselSW1600(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSW1600.class, " ", 1F, "EMD_12_645E_Notch8", 0.45F, 54, "EMD_12_645E_Idle", 0.45F, 54, false, "emd_steelbell_5", 15, new String[] {"nathan_m3h_3"}),
	DieselMP900(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselMP900.class, " ", 1F, "EMD_4_645E_Notch8", 0.45F, 48, "EMD_4_645E_Idle", 0.45F, 54, false, "emd_steelbell_8", 13, new String[] {"nathan_j3_2", "generic_horn_1", "nathan_m3h_1"}),
	DieselMP15DCW9(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselMP15DCW9.class,"leslie_rs3k_2", 1F, "EMD_12_645E_Notch8", 0.45F, 54, "EMD_12_645E_Idle", 0.45F, 54, false, "emd_steelbell_1", 17),
	DieselBeep(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselBeep.class,"leslie_s3lr_1", 1F, "EMD_16_567BC_Notch8", 0.45F, 47, "EMD_16_567BC_Idle", 0.45F, 54, false, "emd_brassbell_1", 15),
	DieselTR4(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselTR4.class, " ", 1F, "EMD_12_567B_Notch8", 0.45F, 28, "EMD_12_567B_Idle", 0.45F, 30, false, "emd_bronzebell_3", 16, new String[] {"leslie_a125_1", "leslie_a125_1", "leslie_a125_1", "leslie_a125_1", "leslie_a125_1", "generic_horn_2"}),
	DieselTR4B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselTR4B.class, " ", 1F, "EMD_12_567B_Notch8", 0.45F, 28, "EMD_12_567B_Idle", 0.45F, 30, false, " ", 16, new String[] {" ", " ", " ", " ", "leslie_a125_1", "leslie_a125_1"}),

	//GE//
	Diesel44Ton(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGE44Ton.class, " ", 1F, "CAT_8_D17000_Notch8", 0.45F, 52, "CAT_8_D17000_Idle", 0.45F, 40, false, "ge_steelbell_1", 18, new String[] {"hancock_airwhistle_1", "hancock_airwhistle_1", "generic_horn_1", "generic_horn_1", "wabco_e2_3", "nathan_k5la_wide_2", "nathan_k5la_wide_2", "nathan_p2_1", "nathan_p2_1", "wabco_e2_dual_1", "hancock_airwhistle_1","leslie_rs3l_2"}),
	DieselBoxcab23Ton(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselBoxcab23Ton.class, "nathan_kj24_1", 1F, "GE_HBI_600_Notch8", 0.45F, 15, "GE_HBI_600_Idle", 0.45F, 25, false, "ge_steelbell_1", 18),
	Diesel25Ton(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselGE25Ton.class, "wabco_e2_3", 1F, "GE_HBI_600_Notch8", 0.45F, 80, "GE_HBI_600_Idle", 0.45F, 100, false, "ge_steelbell_1", 18),
	DieselU18B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselU18B.class, " ", 1F, "GE_7FDL_8_Notch8", 0.25F, 53, "GE_7FDL_8_Idle", 0.45F, 55, false, "ge_steelbell_2", 15, new String[] {"nathan_m3h_1", "nathan_m3h_1", "leslie_s3l_1", "leslie_s3l_3", "generic_horn_1", "nathan_p5_new_4", "leslie_rs5t_3", "nathan_m3h_2", "leslie_a200_triple_1", "leslie_rs5t_1", "leslie_rs5t_2", "leslie_rs5t_4", "nathan_m3h_3", "leslie_rs3l_3", "leslie_rs3l_3", "nathan_m3_6", "nathan_p3_old_1", "nathan_p3_old_5", "leslie_s5t_1", "leslie_s5t_2", "leslie_rs5t_1", "leslie_rs5t_2", "leslie_rs5t_4" }),
	DieselU18BB(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselU18BB.class, " ", 1F, "GE_7FDL_8_Notch8", 0.25F, 53, "GE_7FDL_8_Idle", 0.45F, 55, false, "ge_steelbell_2", 15, new String[] {" ", "leslie_rs3k_faulty_1"}),
	DieselU18BW(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselU18BW.class, " ", 1F, "GE_7FDL_8_Notch8", 0.25F, 53, "GE_7FDL_8_Idle", 0.45F, 55, false, "ge_steelbell_2", 15, new String[] {"nathan_m5_4", "nathan_m5_4", "nathan_m5_5", "generic_horn_2", "leslie_a200_triple_1"}),
	DieselU18Balt(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselU18Balt.class, " ", 1F, "GE_7FDL_8_Notch8", 0.25F, 53, "GE_7FDL_8_Idle", 0.45F, 55, false, "ge_steelbell_3", 15, new String[] {"leslie_s3l_4", "nathan_m3_6", "buell_b3_1", "generic_horn_1", "nathan_m5_1", "nathan_m5_6", "nathan_k3la_2", "leslie_s3l_4", "leslie_s3l_3", "leslie_rs5t_4", "leslie_rs5t_4", "leslie_rs5t_4", "leslie_rs5t_4", "leslie_rs5t_4", "leslie_rs5t_4", "nathan_p5_new_4", "leslie_rs5t_2", "leslie_rs5t_2", "leslie_rs5t_2"}),
	DieselU18BWH(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselU18BWH.class, " ", 1F, "GE_7FDL_8_Notch8", 0.25F, 53, "GE_7FDL_8_Idle", 0.45F, 55, false, "ge_steelbell_2", 15, new String[] {"nathan_k5la_square_1", "nathan_k5la_square_1", "generic_horn_2", "nathan_k5la_square_1"}),
	DieselU23B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselU23B.class, " ", 1F, "GE_7FDL_12_Notch8", 0.45F, 40, "GE_7FDL_12_Idle", 0.45F, 50, false, "ge_steelbell_2", 15, new String[] {"leslie_rs3l_4", "nathan_m3h_1", "leslie_rs3l_3", "generic_horn_1", "nathan_m3r_1", "nathan_m3h_1", "nathan_m3h_1", "leslie_s3l_3", "leslie_s3l_3", "nathan_m3_4", "nathan_p5_old_4", "leslie_s3l_1", "nathan_m5_3", "nathan_m5_6", "leslie_s3l_3", "nathan_k5la_big_3", "leslie_s3l_1", "leslie_rs5t_2", "nathan_m3r_1", "nathan_k5hl_3", "prime_920_5", "buell_b5_1", "nathan_p01235_2", "nathan_p012", "leslie_rs3l_faulty_5", "leslie_rs5t_1", "leslie_rs3k_1", "leslie_s3l_3"}),
	DieselU23BU(DieselU23BU.class, " ", 1F, "GE_7FDL_12_Notch8", 0.45F, 40, "GE_7FDL_12_Idle", 0.45F, 50, false, "ge_steelbell_2", 15, new String[] {"buell_b3_1", "prime_920_5", "buell_b5_2", "nathan_j3_1", "leslie_s3l_1", "nathan_k3l_1", "nathan_p3_new_4", "nathan_p3_new_1", "nathan_p5_new_4", "nathan_p5_old_2", "leslie_rs5t_2", "gp40_2_horn"}),
	DieselU23BW(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselU23BW.class, " ", 1F, "GE_7FDL_12_Notch8", 0.45F, 40, "GE_7FDL_12_Idle", 0.45F, 50, false, "ge_steelbell_2", 15, new String[] {"generic_horn_2", "nathan_k5la_big_3"}),
	DieselSF30B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSF30B.class, " ", 1F, "GE_7FDL_12_Notch8", 0.45F, 40, "GE_7FDL_12_Idle", 0.45F, 50, false, "ge_steelbell_2", 15, new String[] {"generic_horn_2", "nathan_k5la_big_3", "leslie_rs3l_5"}),
	DieselU25B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselU25B.class, " ", 1F, "GE_7FDL_16_Notch8", 0.45F, 52, "GE_7FDL_16_Idle", 0.6F, 51, false, "ge_steelbell_1", 18, new String[] {"leslie_rs3l_3", "generic_horn_1", "prime_920_5", "leslie_s3l_1", "leslie_s3l_1", "prime_920_2", "leslie_rs3k_1", "nathan_m3h_2", "leslie_s3l_2", "nathan_m3_8", "leslie_s3l_2", "leslie_s3l_2", "leslie_s3l_1", "nathan_m3h_faulty_2"}),
	DieselU30BH(DieselU30BH.class, " ", 1F, "GE_7FDL_16_Notch8", 0.45F, 52, "GE_7FDL_16_Idle", 0.45F, 51, false, "ge_steelbell_1", 18, new String[] {"nathan_k5hl_6", "generic_horn_1", "nathan_p5_old_6", "br_horn", "br_horn", "br_horn"}),
	DieselU36B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselU36B.class, " ", 1F, "GE_7FDL_16_Notch8", 0.45F, 52, "GE_7FDL_16_Idle", 0.45F, 51, false, "ge_steelbell_1", 18, new String[] {"leslie_s3l_1", "leslie_rs5t_3", "generic_horn_1", "nathan_k5la_big_3", "leslie_s3l_2", "nathan_m5_4", "leslie_rs5t_2", "leslie_s3lr_1"}),
	DieselU23C(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselU23C.class, " ", 1F, "GE_7FDL_12_Notch8", 0.45F, 40, "GE_7FDL_12_Idle", 0.45F, 50, false, "ge_steelbell_2", 15, new String[] {"leslie_rs3l_4", "nathan_m3_8", "generic_horn_1"}),
	DieselU30C(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselU30C.class, " ", 1F, "GE_7FDL_16_Notch8", 0.45F, 52, "GE_7FDL_16_Idle", 0.45F, 51, false, "ge_steelbell_1", 18, new String[] {"leslie_rs3k_1", "generic_horn_1", "prime_990_4", "nathan_p3_new_1", "leslie_s3l_1", "nathan_p5_new_2", "leslie_a200_triple_1", "leslie_s3l_3", "nathan_p5_new_2", "leslie_rs5t_4" }),
	DieselSF30C(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSF30C.class, "leslie_s3l_1", 1F, "GE_FDL16_Notch8", 0.45F, 52, "GE_FDL16_Idle", 0.45F, 51, false, "ge_steelbell_1", 18),
	DieselU36C(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselU36C.class, " ", 1F, "GE_7FDL_16_Notch8", 0.45F, 52, "GE_7FDL_16_Idle", 0.45F, 51, false, "ge_steelbell_1", 18, new String[] {"leslie_rs3l_3", "leslie_s3l_1", "leslie_s3l_1", "leslie_s3l_3", "prime_990_3", "nathan_j3_3"}),
	DieselU50(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselU50.class, " ", 1F, "GE_7FDL_16_Notch8", 0.45F, 52, "GE_7FDL_16_Idle", 0.45F, 51, false, "ge_steelbell_1", 18, new String[] {"leslie_a200_dual_1", "nathan_p3_old_1", "generic_horn_1", "prime_990_4", "generic_horn_1", "nathan_p6_1", "nathan_p6_1", "leslie_rs3l_4", "leslie_s3l_3"}),
	DieselU56(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselU56.class, " ", 1F, "GE_7FDL_16_Notch8", 0.45F, 52, "GE_7FDL_16_Idle", 0.45F, 51, false, "ge_steelbell_1", 18, new String[] {"buell_b5_1", "buell_b5_2"}),
	DieselSB18R(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSB18R.class, " ", 1F, "GE_7FDL_8_Notch8", 0.25F, 53, "GE_7FDL_8_Idle", 0.25F, 55, false, "ge_steelbell_2", 15, new String[] {"generic_horn_2", "generic_horn_2", "nathan_m5r_1", "nathan_m5r_2", "nathan_m3h_1", "nathan_m3h_2", "nathan_m3h_3", "nathan_m3h_4", "nathan_m3h_1", "nathan_m3h_2", "nathan_k5hl_3"}),
	DieselSB18E(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSB18E.class, " ", 1F, "GE_7FDL_8_Notch8", 0.25F, 53, "GE_7FDL_8_Idle", 0.25F, 55, false, "ge_steelbell_1", 18, new String[] {"generic_horn_2", "nathan_m5r_1", "nathan_m5r_2", "nathan_m5r_1", "leslie_s3l_1", "nathan_k5la_big_3", "nathan_k5hl_3"}),
	DieselSB18B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSB18B.class, " ", 1F, "GE_7FDL_8_Notch8", 0.25F, 53, "GE_7FDL_8_Idle", 0.25F, 55, false, "ge_steelbell_1", 18, new String[] {" ", "wabco_e2_1", "wabco_e2_2", "wabco_e2_3", "wabco_e2_3"}),
	DieselB23(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselB23.class, " ", 1F, "GE_7FDL_12_Notch8", 0.45F, 40, "GE_7FDL_12_Idle", 0.45F, 50, false, "ge_steelbell_1", 18, new String[] {"nathan_m3h_1", "nathan_p3_new_3", "nathan_p3_new_3", "prime_920_4", "generic_horn_1", "nathan_m5_5", "nathan_m5_5", "leslie_rs5t_3", "leslie_s3l_2", "nathan_p5_old_6", "nathan_p3_faulty_1", "leslie_s3l_2", "leslie_rs5t_2", "nathan_k5la_big_3", "leslie_rs3l_3", "leslie_s3l_2", "nathan_p3_old_2", "nathan_m3_8", "leslie_rs3l_2", "nathan_m3_8", "nathan_k5la_small_1", "nathan_m3_7", "nathan_p5_new_4", "nathan_p3_new_1", "leslie_rs3l_4", "nathan_m5_3", "nathan_j3_1", "leslie_rs3l_4", "leslie_rs3l_faulty_2"}),
	DieselB23_wrx(DieselB23_wrx.class, " ", 1F, "GE_7FDL_12_Notch8", 0.45F, 40, "GE_7FDL_12_Idle", 0.45F, 50, false, "ge_steelbell_1", 18, new String[] {"nathan_m5_1", "nathan_m5r_2"}),
	DieselB23S7(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselB23S7.class, " ", 1F, "GE_7FDL_12_Notch8", 0.45F, 40, "GE_7FDL_12_Idle", 0.45F, 50, false, "ge_steelbell_1", 18, new String[] {"leslie_rs3l_2", "leslie_rs3l_2", "leslie_s3l_1", "generic_horn_1", "nathan_p3_old_5", "nathan_k5l_2", "nathan_k5l_3", "nathan_k3la_5"}),
	DieselBQ23(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselBQ23.class, " ", 1F, "GE_7FDL_12_Notch8", 0.45F, 40, "GE_7FDL_12_Idle", 0.45F, 50, false, "ge_steelbell_1", 18, new String[] {"leslie_rs5t_3", "leslie_s3l_3", "generic_horn_1", "nathan_k5la_big_3", "nathan_k5la_big_3", "leslie_rs5t_3", "bb_horn", "nathan_m3_8"}),
	DieselSB23R(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSB23R.class, " ", 1F, "GE_7FDL_12_Notch8", 0.45F, 40, "GE_7FDL_12_Idle", 0.45F, 50, false, "ge_steelbell_2", 15, new String[] {"wabco_e2_1", "prime_920_4", "nathan_k5hl_3", "generic_horn_2"}),
	DieselSB23E(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSB23E.class, " ", 1F, "GE_7FDL_12_Notch8", 0.45F, 40, "GE_7FDL_12_Idle", 0.45F, 50, false, "ge_steelbell_1", 18, new String[] {"nathan_m5_5", "nathan_m5_3", "prime_990_4", "generic_horn_2", "nathan_k5la_big_3", "nathan_k5hl_3"}),
	DieselB30(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselB30.class, " ", 1F, "GE_7FDL_16_Notch8", 0.45F, 52, "GE_7FDL_16_Idle", 0.45F, 51, false, "ge_steelbell_1", 18, new String[] {"nathan_k5l_1", " ", "nathan_k5l_3", "leslie_rs5t_3"}),
	DieselSB36X(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselSB36X.class, " ", 1F, "GE_7FDL_16_Notch8", 0.45F, 52, "GE_7FDL_16_Idle", 0.45F, 51, false, "ge_steelbell_1", 18, new String[] { "nathan_m3h_1", "nathan_m3h_2", "nathan_m3h_3", "nathan_m3h_4", "nathan_m3h_1", "nathan_m3h_2", "nathan_m3h_1", "nathan_m3h_2", "nathan_m3h_3", "nathan_m3h_4", "nathan_m3h_1", "nathan_m3h_2", "nathan_m3h_1"}),
	DieselB36(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselB36.class, " ", 1F, "GE_7FDL_16_Notch8", 0.45F, 52, "GE_7FDL_16_Idle", 0.45F, 51, false, "ge_steelbell_3", 18, new String[] { "nathan_p3_new_1", " ", "nathan_p3_old_3"}),
	DieselDash818BE(DieselDash818BE.class, " ", 1F, "GE_7FDL_8_Notch8", 0.25F, 53, "GE_7FDL_8_Idle", 0.45F, 55, false, "ge_steelbell_3", 15, new String[] {"buell_b5_2"}),
	DieselDash832BWH(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselDash832BWH.class, " ", 1F, "GE_7FDL_12_Notch8", 0.45F, 40, "GE_7FDL_12_Idle", 0.45F, 50, false, "ge_steelbell_1", 18, new String[] {"nathan_k5la_big_1", "nathan_k5la_big_1", "nathan_k5la_big_1", "nathan_m5_5", "generic_horn_1"}),
	DieselDash839C(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselDash839C.class, " ", 1F, "GE_7FDL_16_Notch8", 0.45F, 52, "GE_7FDL_16_Idle", 0.45F, 51, false, "ge_steelbell_1", 18, new String[] {"leslie_s3l_1", "nathan_k5la_big_2", "nathan_p5_new_4", "nathan_k5l_2", "nathan_k5lla_1", "prime_990_2", "generic_horn_1", "nathan_k5hl_3", "nathan_p5_old_5", "nathan_m3_3"}),
	DieselDash839CE(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselDash839CE.class, " ", 1F, "GE_7FDL_16_Notch8", 0.45F, 52, "GE_7FDL_16_Idle", 0.45F, 51, false, "ge_steelbell_1", 18, new String[] {"prime_990_3", "leslie_rs3l_1", "leslie_rs3l_5", "nathan_k5la_big_2", "generic_horn_1", "leslie_rs3L_3", "leslie_rs3l_4"}),
	DieselDash839B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselDash839B.class, " ", 1F, "GE_7FDL_16_Notch8", 0.45F, 52, "GE_7FDL_16_Idle", 0.45F, 51, false, "ge_steelbell_1", 18, new String[] {"nathan_p5_mixed_1", "nathan_k5la_small_1", "nathan_m5_4", "nathan_m5_2", "nathan_m5_5", "generic_horn_1", "buell_b3_1", "leslie_rs3l_3", "nathan_m3_3", "leslie_rs3l_2"}),
	DieselDash840B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselDash840B.class, " ", 1F, "GE_7FDL_16_Notch8", 0.45F, 52, "GE_7FDL_16_Idle", 0.45F, 10, false, "ge_steelbell_1", 18, new String[] {"nathan_k5la_big_2", "leslie_s3l_1", "prime_990_2", "leslie_s3l_3", "nathan_m3h_1", "nathan_k5l_1"}),
	DieselDash840BB(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselDash840BB.class, " ", 1F, "GE_7FDL_16_Notch8", 0.45F, 52, "GE_7FDL_16_Idle", 0.45F, 51, false, "ge_steelbell_1", 18),
	DieselDash840BW(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselDash840BW.class, " ", 1F, "GE_7FDL_16_Notch8", 0.45F, 52, "GE_7FDL_16_Idle", 0.45F, 51, false, "ge_steelbell_1", 18, new String[] {"leslie_s3l_1", "leslie_s3l_1", "generic_horn_1", "nathan_k5hl_3", "leslie_s3l_3"}),
	DieselDash840C(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselDash840C.class, " ", 1F, "GE_FDL16_Notch8", 0.45F, 23, "GE_FDL16_Idle", 0.45F, 103, false, "ge_steelbell_1", 18, new String[] {"leslie_s3l_1", "leslie_rs5t_4", "nathan_k5la_big_3", "leslie_rs3l_2", "nathan_k3la_5", "generic_horn_1", "nathan_k5hl_3","nathan_k5l_1", "nathan_k5la_big_3", "leslie_rs5t_4"}),
	DieselDash841C(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselDash841C.class, " ", 1F, "GE_7FDL_16_Notch8", 0.45F, 52, "GE_7FDL_16_Idle", 0.45F, 51, false, "ge_steelbell_1", 18, new String[] {"nathan_k3l_1", "generic_horn_1", "nathan_p5_old_1", "nathan_m5_5", "nathan_m5_3", "nathan_k5l_3", "nathan_p01345_1", }),
	DieselDash940C(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselDash940C.class, " ", 1F, "GE_7FDL_16_Notch8", 0.45F, 52, "GE_7FDL_16_Idle", 0.45F, 50, false, "ge_steelbell_1", 18, new String[] {"nathan_m5_4"}),
	DieselDash9C44W(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselDash944CW.class, " ", 1F, "GE_7FDL_16_Notch8", 0.45F, 52, "GE_7FDL_16_Idle", 0.45F, 50, false, "ge_steelbell_1", 18, new String[] {"nathan_k5lar_1", "nathan_k5lar_faulty_1", "generic_horn_1", "nathan_m3h_3", "nathan_k3la_4", "nathan_p3_new_3", "nathan_k3la_2", "nathan_k5l_1", "nathan_k5hl_3", "nathan_m5r_1", "nathan_k5hll_1", "nathan_k5hl_2", "leslie_s3lr_1", "nathan_k3la_4", "leslie_s3lr_1", "nathan_k5hll_1"}),
	DieselAC4400CW(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselAC4400CW.class, "  ", 1F, "GE_7FDL_16_Notch8", 0.45F, 52, "GE_7FDL_16_Idle", 0.45F, 50, false, "ge_steelbell_1", 18, new String[] {"nathan_k5la_big_1", "nathan_k5l_2", "generic_horn_1"}),
	DieselAC4400C(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselAC4400C.class, "  ", 1F, "GE_7FDL_16_Notch8", 0.45F, 52, "GE_7FDL_16_Idle", 0.45F, 50, false, "ge_steelbell_1", 18, new String[]  {"nathan_m5_2", "buell_b5_3", "buell_b5_1", "nathan_k5l_3", "generic_horn_1", "nathan_p3_new_3"}),
	DieselES44(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselES44.class, " ", 1F, "GE_GEVO_12_Notch8", 0.45F, 20, "GE_GEVO_12_Idle", 0.45F, 50, false, "graham_ebell", 14, new String[] {"nathan_k5hl_4", "nathan_k5hl_2", "nathan_k5hl_2", "nathan_k5hll_1", "nathan_k5hll_2", "nathan_k5hl_1", "nathan_k5hl_3", "nathan_k5hll_3", "nathan_k5hl_5", "generic_horn_1", "nathan_k5la_wide_3", "nathan_k5hl_2","nathan_k5hl_3", "nathan_k5hl_6", "nathan_k5hll_1", "nathan_k5hll_3", "nathan_k5hll_2", "nathan_m3_3", "nathan_m3_3"}),
	DieselES44h(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselES44h.class, " ", 1F, "GE_GEVO_12_Notch8", 0.45F, 20, "GE_GEVO_12_Idle", 0.45F, 50, false, "graham_ebell", 14, new String[] {"nathan_k5hlb_1", "nathan_k5hlb_5", "nathan_k5hlb_6", "nathan_k5hlb_4", "nathan_k5hlb_3", "nathan_k5hlb_7", "nathan_k5hlb_8", "nathan_k5hlb_6", "nathan_k5hlb_6", "nathan_k5hlb_7", "nathan_k5hlb_2", "nathan_k5hl_2", "nathan_k5hl_4", "nathan_k5hl_1", "nathan_k5hl_5", "nathan_k5hl_1", "nathan_k5hl_6", "nathan_k5hl_5", "nathan_k5hl_3", "nathan_k5hl_6.ogg", "nathan_k5hl_2", "nathan_k5hl_5", "nathan_k5hl_1", "nathan_k5hl_5", "nathan_k5hl_1", "nathan_k5hll_3", "nathan_k5hl_1", "nathan_k5hl_1", "nathan_k5hl_1", "nathan_k5hl_1", "nathan_k5hl_1", "nathan_k5hl_1", "leslie_rs5t_3", "leslie_s5t_1", "leslie_rs5t_2","nathan_p5_old_1", "nathan_p5_old_1"}),
	DieselP32(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselP32.class, "nathan_k5la_big_1", 1F, "GE_7FDL_12_Notch8", 0.45F, 40, "GE_7FDL_12_Idle", 0.45F, 50, false, "ge_steelbell_2", 15),
	DieselP40(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselP40.class, "nathan_k5la_big_1", 1F, "GE_7FDL_12_Notch8", 0.45F, 40, "GE_7FDL_12_Idle", 0.45F, 50, false, "ge_steelbell_2", 15),
	DieselP42(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselP42.class, " ", 1F, "GE_7FDL_16_Notch8", 0.45F, 52, "GE_7FDL_16_Idle", 0.45F, 51, false, "ge_steelbell_1", 18, new String[] {"nathan_k5la_wide_3", "nathan_k5la_raised_3", "nathan_k5la_raised_3", "nathan_k5la_raised_3"}),
	Diesel4ED172T(com.jcirmodelsquad.tcjcir.vehicles.locomotives.Diesel4ED172T.class," ", 1F, "chme3_idle", 0.45F, 40, "chme3_idle", 0.45F, 40, false, "alco_bronzebell_3", 18, new String[] {"wabco_e2_2", "wabco_e2_2", "wabco_e2_3", "nathan_m3_5", "generic_horn_2", "generic_horn_2", "wabco_e2_1", "wabco_e2_2"}),
	Diesel4ED172_E(com.jcirmodelsquad.tcjcir.vehicles.locomotives.Diesel4ED172T_E.class," ", 1F, "EMD_12_567B_Notch8", 0.45F, 28, "EMD_12_567B_Idle", 0.45F, 30, false, "alco_bronzebell_3", 18, new String[] {"nathan_m3_5", "generic_horn_2"}),
	Diesel4ED172_G(com.jcirmodelsquad.tcjcir.vehicles.locomotives.Diesel4ED172T_G.class," ", 1F, "GE_7FDL_8_Notch8", 0.25F, 53, "GE_7FDL_8_Idle", 0.25F, 55, false, "alco_bronzebell_3", 18, new String[] {"leslie_s3l_4", "generic_horn_2"}),
	Diesel4ED172_C(com.jcirmodelsquad.tcjcir.vehicles.locomotives.Diesel4ED172T_C.class," ", 1F, "CAT_D399_Notch8", 0.45F, 64, "CAT_D399_Idle", 0.45F, 64, false, "alco_bronzebell_3", 18, new String[] {"nathan_m3_3", "generic_horn_2", "nathan_m3_3"}),

	//ALCO/MLW//
	DieselPA1(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselPA1.class," ", 1F, "ALCO_16_244_Notch8", 0.45F, 14, "ALCO_16_244_Idle", 0.45F, 28, false, "alco_bronzebell_3", 18, new String[] {"leslie_a200_dual_1", "leslie_rs3l_3", "leslie_a200_dual_1", "nathan_m5_3", "leslie_a200_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_rs3l_3", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_rs3l_3", "leslie_a200_1", "leslie_a200_dual_1", "leslie_rs3l_3", "leslie_a200_dual_1"}),
	DieselPB1(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselPB1.class," ", 1F, "ALCO_16_244_Notch8", 0.45F, 14, "ALCO_16_244_Idle", 0.45F, 28, false, "alco_bronzebell_3", 18, new String[] {"leslie_a200_4", "leslie_a200_4", "leslie_a200_4", "leslie_a200_4", " ", "leslie_a200_4", "leslie_a200_4", "leslie_a200_4"}),
	DieselFA1(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselFA1.class," ", 1F, "ALCO_12_244_Notch8", 0.45F, 51, "ALCO_12_244_Idle", 0.45F, 50, false, "alco_bronzebell_3", 18, new String[] {"leslie_a200_dual_2", "leslie_a200_dual_2", "leslie_a200_dual_2", "leslie_a200_dual_2", "leslie_a200_dual_2", "leslie_a200_dual_2", "leslie_a200_dual_2", "leslie_a200_dual_2", "nathan_m3r_1", "nathan_m3r_1",}),
	DieselFB1(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselFB1.class," ", 1F, "ALCO_12_244_Notch8", 0.45F, 51, "ALCO_12_244_Idle", 0.45F, 50, false, "alco_bronzebell_3", 18, new String[] {"leslie_a200_4", "leslie_a200_4", "leslie_a200_4", "leslie_a200_4", " ", " ", "leslie_a200_4"}),
	DieselFA2(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselFA2.class," ", 1F, "ALCO_12_244_Notch8", 0.45F, 51, "ALCO_12_244_Idle", 0.45F, 50, false, "alco_bronzebell_3", 18, new String[] {"leslie_a200_dual_2", "leslie_a200_dual_2", "leslie_a200_dual_2", "leslie_a200_dual_2", "leslie_a200_dual_2", "leslie_a200_dual_2", "leslie_a200_dual_2", "leslie_a200_dual_2", "nathan_m3h_1", "nathan_m3h_1", "nathan_p5_old_5"}),
	DieselFB2(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselFB2.class," ", 1F, "ALCO_12_244_Notch8", 0.45F, 51, "ALCO_12_244_Idle", 0.45F, 50, false, "alco_bronzebell_3", 18, new String[] {"leslie_a200_4", "leslie_a200_4", "leslie_a200_4", " ", " ", "leslie_a200_4", "leslie_a200_4", "leslie_a200_4"}),
	DieselFPA4(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselFPA4.class,"nathan_m3h_1", 1F, "ALCO_12_251C_Notch8", 0.45F, 51, "ALCO_12_251C_Idle", 0.45F, 50, false, "alco_bronzebell_3", 18),
	DieselFPB4(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselFPB4.class,"leslie_a200_2", 1F,  "ALCO_12_251C_Notch8", 0.45F, 51, "ALCO_12_251C_Idle", 0.45F, 50, false, " ", 24),
	DieselFAFDL(DieselFAFDL.class," ", 1F, "GE_7FDL_8_Notch8", 0.25F, 53, "GE_7FDL_8_Idle", 0.45F, 55, false, "ge_steelbell_1", 18, new String[] {"prime_920_5", "generic_horn_2", "nathan_m3_3"}),
	DieselFBFDL(DieselFBFDL.class," ", 1F, "GE_7FDL_8_Notch8", 0.25F, 53, "GE_7FDL_8_Idle", 0.45F, 55, false, "ge_steelbell_1", 18, new String[] {"leslie_a200_2", " ", " "}),
	DieselRS1(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselRS1.class, " ", 1F, "ALCO_12_244_Notch8", 0.45F, 51, "ALCO_12_244_Idle", 0.45F, 50, false, "alco_bronzebell_1", 9, new String[] {"leslie_a200_4", "leslie_a200_4", "nathan_m5_4", "generic_horn_1", "leslie_a200_4", "leslie_a200_4", "leslie_rs3l_2", "leslie_a200_3", "nathan_m3_3", "leslie_a200_3", "nathan_p3_new_3", "leslie_a200_4"}),
	DieselRS2(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselRS2.class, " ", 1F, "ALCO_12_244_Notch8", 0.45F, 51, "ALCO_12_244_Idle", 0.45F, 50, false, "alco_bronzebell_1", 9, new String[] {"nathan_m3_3", "generic_horn_1", "leslie_a200_3", "leslie_a200_3", "leslie_a200_3", "nathan_ms1", "leslie_a200_4"}),
	DieselRS3(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselRS3.class, " ", 1F, "ALCO_12_244_Notch8", 0.45F, 51, "ALCO_12_244_Idle", 0.45F, 50, false, "alco_bronzebell_1", 9, new String[] {"nathan_m3_3", "generic_horn_1", "nathan_m3_3", "nathan_m3_3", "leslie_a200_4"}),
	DieselRSFDL(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselRSFDL.class, " ", 1F, "GE_7FDL_8_Notch8", 0.25F, 53, "GE_7FDL_8_Idle", 0.25F, 55, false, "ge_steelbell_2", 15, new String[] {"nathan_m3_7"}),
	DieselC415H(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselC415H.class, " ", 1F, "ALCO_8_251F_Notch8", 0.45F, 46, "ALCO_8_251F_Idle", 0.45F, 54, false, "alco_bronzebell_1", 9, new String[] {"leslie_s2m_1", "leslie_s2m_1", "leslie_rs3l_faulty_2", "nathan_p3_new_4", "nathan_p3_new_3", "leslie_rs3l_5"}),
	DieselC415S(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselC415S.class, " ", 1F, "ALCO_8_251F_Notch8", 0.45F, 46, "ALCO_8_251F_Idle", 0.45F, 54, false, "alco_bronzebell_1", 9, new String[] {"leslie_rs3k_1", "leslie_rs3l_faulty_1", "nathan_m3_2", "leslie_rs3k_3", "generic_horn_1", "leslie_rs3l_2", "leslie_rs3l_2"}),
	DieselC415L(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselC415L.class, "nathan_ms1", 1F, "ALCO_8_251F_Notch8", 0.45F, 46, "ALCO_8_251F_Idle", 0.45F, 54, false, "alco_bronzebell_1", 9),
	DieselC424(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselC424.class, " ", 1F, "ALCO_16_251B_Notch8", 0.45F, 55, "ALCO_16_251B_Idle", 0.45F, 34, false, "alco_bronzebell_2", 13, new String[] {"nathan_m3_1", "nathan_k3la_4", "nathan_m3_4", "nathan_m3h_1", "prime_920_2", "leslie_s3l_2", "leslie_s3l_2", "generic_horn_1", "prime_990_4", "nathan_p3_new_4", "leslie_s3l_2", "prime_990_1", "nathan_m3_1", "nathan_m3_3"}),
	DieselC425(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselC425.class, " ", 1F, "ALCO_16_251C_Notch8", 0.45F, 52, "ALCO_16_251C_Idle", 0.45F, 69, false, "alco_bronzebell_2", 13, new String[] {"leslie_s3l_2", "nathan_m3_3", "nathan_m3_5", "nathan_m3_1"}),
	DieselDH643(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselDH643.class, "nathan_p3_old_4", 1F, "ALCO_12_251C_Notch8", 0.45F, 51, "ALCO_12_251C_Idle", 0.45F, 50, false, "alco_bronzebell_2", 13),
	DieselC855a(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselC855a.class, " ", 2.5F, "ALCO_16_251C_Dual_Notch8", 1F, 51, "ALCO_16_251C_Dual_Idle", 0.45F, 50, false, "alco_bronzebell_2", 13, new String[] {"leslie_rs3l_1", "nathan_m5r_2","nathan_m3_3"}),
	DieselC855b(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselC855b.class, " ", 2.0F, "ALCO_16_251C_Dual_Notch8", 1F, 51, "ALCO_16_251C_Dual_Idle", 0.45F, 50, false, "alco_bronzebell_2", 13, new String[] {" ", "nathan_m3r_1", "nathan_m3_3"}),
	DieselHH600(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselHH660.class," ", 1F, "ALCO_6_531_Notch8", 0.45F, 69, "ALCO_6_531_Idle", 0.45F, 136, false, "alco_bronzebell_1", 9, new String[] {"leslie_a125_1", "leslie_a125_1", "leslie_a125_1", "leslie_a125_1", "leslie_a125_1", "leslie_a125_1", "br_horn", "br_horn", "nathan_p3_old_1", "nathan_p3_old_1", "nathan_p3_old_2"}),
	DieselS2(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselS2.class, "leslie_a200_1", 1F, "ALCO_6_539T_Notch8", 0.45F, 34, "ALCO_6_539T_Idle", 0.45F, 58, true, "alco_bronzebell_1", 9),
	DieselRSD15(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselRSD15.class," ", 1F, "ALCO_16_251B_Notch8", 0.45F, 55, "ALCO_16_251B_Idle", 0.45F, 34, false, "alco_bronzebell_3", 18, new String[] {"nathan_m3_1", "nathan_m3_1", "generic_horn_1", "nathan_m5_1" }),
	DieselM420(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselM420.class, " ", 1F, "ALCO_12_251C_Notch8", 0.45F, 51, "ALCO_12_251C_Idle", 0.45F, 50, false, "alco_bronzebell_3", 18, new String[] {"nathan_m5_3", "nathan_m5_3", "nathan_k3l_1", "nathan_k5l_3", "nathan_k5l_2"}),
	DieselM420B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselM420B.class, " ", 1F, "ALCO_12_251C_Notch8", 0.45F, 51, "ALCO_12_251C_Idle", 0.45F, 50, false, "alco_bronzebell_3", 18, new String[] {"leslie_a200_2", "leslie_a200_2", "nathan_k3l_1"}),
	DieselM630D(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselM630.class, " ", 1F, "ALCO_16_251E_Notch8", 0.45F, 64, "ALCO_16_251E_Idle", 0.45F, 65, false, "alco_bronzebell_3", 18, new String[] {"nathan_m3h_4", "generic_horn_1", "nathan_m3h_4", "nathan_m3_3", "nathan_m3h_4"}),
	DieselM630R(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselM630R.class, " ", 1F, "ALCO_16_251E_Notch8", 0.45F, 64, "ALCO_16_251E_Idle", 0.45F, 65, false, "alco_bronzebell_3", 18, new String[] {"generic_horn_1"}),
	DieselM630W(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselM630W.class, " ", 1F, "ALCO_16_251E_Notch8", 0.45F, 64, "ALCO_16_251E_Idle", 0.45F, 65, false, "alco_bronzebell_3", 18, new String[] {"generic_horn_1", "nathan_m3h_4", "nathan_k5l_2"}),
	DieselM636D(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselM636.class, " ", 1F, "ALCO_16_251E_Notch8", 0.45F, 64, "ALCO_16_251E_Idle", 0.45F, 65, false, "alco_bronzebell_3", 18, new String[] {"nathan_m3h_faulty_2", "nathan_m3h_3", "nathan_m3h_3", "nathan_m3h_faulty_2", "generic_horn_1"}),
	DieselM636R(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselM636R.class, " ", 1F, "ALCO_16_251E_Notch8", 0.45F, 64, "ALCO_16_251E_Idle", 0.45F, 65, false, "alco_bronzebell_3", 18, new String[] {"nathan_m3h_1", "nathan_m3h_1", "generic_horn_1"}),
	DieselM640(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselM640.class, " ", 1F, "ALCO_16_251E_Notch8", 0.45F, 64, "ALCO_16_251E_Idle", 0.45F, 65, false, "alco_bronzebell_3", 18, new String[] {"nathan_m3h_1", "nathan_m3h_1", "generic_horn_1", "nathan_m3h_4", "nathan_m3h_2", "nathan_m3h_4", "nathan_m3h_1"}),
	DieselM640W(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselM640W.class, " ", 1F, "ALCO_16_251E_Notch8", 0.45F, 64, "ALCO_16_251E_Idle", 0.45F, 65, false, "alco_bronzebell_3", 18, new String[] {"nathan_m5_3", "nathan_m5_3", "generic_horn_1", "nathan_m5_3"}),

	//BALDWIN//
	DieselVO1000(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselVO1000.class," ", 1F, "Baldwin_8VO_Notch8", 0.45F, 58, "Baldwin_8VO_Idle", 0.45F, 62, false, "baldwin_brassbell_1", 22, new String[] {"wabco_e2_1", "wabco_e2_1", "wabco_e2_1", "leslie_a125_1", "prime_990_1" }),
	DieselDS441000(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselDS441000.class," ", 1F, "Baldwin_608A_Notch8", 0.45F, 55, "Baldwin_608A_Idle", 0.45F, 47, false, "baldwin_brassbell_1", 22, new String[] {"leslie_a125_1", "leslie_a125_1", "leslie_a125_1", "leslie_a125_1", "leslie_a125_1"}),
	DieselS12(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselS12.class," ", 1F, "Baldwin_606A_Notch8", 0.45F, 42, "Baldwin_606A_Idle", 0.45F, 37, false, "baldwin_brassbell_1", 22, new String[] {"leslie_a125_1", "generic_horn_1", "leslie_a125_1", "leslie_rs3l_2", "leslie_s3l_3", "nathan_p3_old_1", "nathan_n3_1", "leslie_a125_1"}),
	DieselDR441500APhase2(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselDR441500Phase2.class," ", 1F, "Baldwin_608A_Notch8", 0.45F, 55, "Baldwin_608A_Idle", 0.45F, 47, false, "baldwin_brassbell_1", 22, new String[] {"leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "generic_horn_1", "leslie_rs3k_1", "nathan_p01235_2"}),
	DieselDR441500BPhase2(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselDR441500BPhase2.class," ", 1F, "Baldwin_608A_Notch8", 0.45F, 55, "Baldwin_608A_Idle", 0.45F, 47, false, " ", 22, new String[] {" ", " ", " ", " ", " ", " ", "generic_horn_1", "leslie_a200_dual_1", "leslie_a200_dual_1"}),
	DieselDR441500Shark(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselDR441500Shark.class," ", 1F, "Baldwin_608A_Notch8", 0.45F, 55, "Baldwin_608A_Idle", 0.45F, 47, false, "baldwin_brassbell_1", 22, new String[] {"leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "generic_horn_1",}),
	DieselDR441500BShark(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselDR441500BShark.class," ", 1F, "Baldwin_608A_Notch8", 0.45F, 55, "Baldwin_608A_Idle", 0.45F, 47, false, " ", 22),
	DieselRF16(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselRF16.class," ", 1F, "Baldwin_608A_Notch8", 0.45F, 55, "Baldwin_608A_Idle", 0.45F, 47, false, "baldwin_brassbell_1", 22, new String[] {"nathan_m3_4", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "leslie_a200_dual_1", "generic_horn_1", "ateam"}),
	DieselRF16B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselRF16B.class," ", 1F, "Baldwin_608A_Notch8", 0.45F, 55, "Baldwin_608A_Idle", 0.45F, 47, false, " ", 22),

	//FM//
	DieselH1044(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselH1044.class, " ", 1F, "FM_38D_6_Notch8", 0.45F, 45, "FM_38D_6_Idle", 0.45F, 58, false, "alco_bronzebell_3", 18,  new String[] {"hancock_airwhistle_1", "wabco_e2_1", "wabco_e2_1", "wabco_e2_1", "wabco_e2_1", "wabco_e2_1", "nathan_m3h_1", "wabco_e2_1", "nathan_j3_1", "wabco_e2_1", "wabco_e2_1", "prime_990_4"}),
	DieselH16_66(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselH16_66.class," ", 1F,"FM_38D_6_Notch8", 0.45F, 45, "FM_38D_6_Idle", 0.45F, 58, false,"alco_bronzebell_3", 18, new String[] {"wabco_e2_dual_1", "leslie_s3l_1", "leslie_s3l_1", "wabco_e2_dual_1", "wabco_e2_dual_1", "wabco_e2_dual_1", "wabco_e2_dual_1", "wabco_e2_dual_1", "wabco_e2_dual_1", "wabco_e2_dual_1", "nathan_p5_new_2", "leslie_s3l_3", "wabco_e2_dual_1"}),
	DieselH24_66(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselH24_66.class," ", 1F,"FM_38D_6_Notch8", 0.45F, 45, "FM_38D_6_Idle", 0.45F, 58, false,"alco_bronzebell_3", 18, new String[] {"wabco_e2_dual_1", "leslie_s3l_2", "leslie_s3l_2", "wabco_e2_dual_1", "nathan_p5_new_4", "wabco_e2_dual_1", "leslie_a200_triple_1" }),
	DieselH24_66L(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselH24_66L.class," ", 1F,"FM_38D_6_Notch8", 0.45F, 45, "FM_38D_6_Idle", 0.45F, 58, false,"alco_bronzebell_3", 18, new String[] {"leslie_s3l_3", "nathan_p5_new_3"}),
	DieselH24_66C(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselH24_66C.class," ", 1F,"FM_38D_6_Notch8", 0.45F, 45, "FM_38D_6_Idle", 0.45F, 58, false,"alco_bronzebell_3", 18, new String[] {"nathan_m3h_1", "nathan_m3h_2", "nathan_m3h_3"}),

	//OTHER//
	DieselNRE3gs21b(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselNRE3gs21b.class," ", 1F, "QSK19C_Notch8", 0.45F, 40, "QSK19C_Idle", 0.45F, 53, false, "ge_steelbell_2", 15, new String[] {"br_horn", "nathan_k3la_2", "nathan_k3la_5", "nathan_k3la_5", "nathan_k3la_3"}),
	Dieselgtavthing(com.jcirmodelsquad.tcjcir.vehicles.locomotives.Dieselgtavthing.class,"leslie_s3_1", 1F, "EMD_16_567D3_Notch8", 0.45F, 55, "EMD_16_567D3_Idle", 0.45F, 47, false, "emd_steelbell_4", 10),
	DieselFOLM1B(DieselFOLM1B.class, " ", 0.8F, "FM_38D_6_Notch8", 0.65F, 45, "FM_38D_6_Idle", 0.65F, 58, false, " ", 0),
	DieselKrautt(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselKrautt.class,"nathan_p3_old_4", 1F, "Maybach_MD870_16_Notch8", 0.45F, 52, "Maybach_MD870_16_Idle", 0.45F, 42, false, "ge_steelbell_1", 15),
	DieselDD55(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselDD55.class, " ", 1F, "deltic_run", 0.65F, 62, "deltic_idle", 0.65F, 48, false, "alco_bronzebell_3", 18, new String[] {"leslie_a200_triple_1", "nathan_p5_old_4", "generic_horn_2", "nathan_k5la_big_3", "nathan_k5la_hybrid_1"}),
	DieselTB27(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselTB27.class, " ", 1F, "EMD_8_645E_Notch8", 0.45F, 48, "EMD_8_645E_Idle", 0.45F, 54, false, "emd_steelbell_8", 13, new String[] {"nathan_n3_1", "generic_horn_1", "nathan_m3h_4", "nathan_p5_old_4"}),
	ElectricCEESlug(com.jcirmodelsquad.tcjcir.vehicles.locomotives.ElectricCEEslug.class, " ", 1F, "MILW_Idle", 0.45F, 40, "MILW_Idle", 0.45F, 50, false, "ge_steelbell_2", 15, new String[] {"nathan_j3_3","nathan_m3r_1", "gp40_2_horn", "generic_horn_2"}),

	//ELECTRIC//
	ElectricEF1(com.jcirmodelsquad.tcjcir.vehicles.locomotives.ElectricEF1.class, "wabco_e2_1", 1F, "MILW_Notch8", 0.45F, 40, "MILW_Idle", 0.45F, 50, false, "alco_bronzebell_3", 18),
	ElectricEF1B(com.jcirmodelsquad.tcjcir.vehicles.locomotives.ElectricEF1B.class, " ", 0, "MILW_Notch8", 0.45F, 40, "MILW_Idle", 0.45F, 50, false, "alco_bronzebell_3", 18),
	ElectricEP1A(com.jcirmodelsquad.tcjcir.vehicles.locomotives.ElectricEP1A.class, "wabco_e2_1", 2.5F, "MILW_Notch8", 0.45F, 40, "MILW_Idle", 0.45F, 50, false, "alco_bronzebell_3", 18),
	ElectricGM6C_2(com.jcirmodelsquad.tcjcir.vehicles.locomotives.ElectricGM6C_2.class, " ", 1F, "MILW_Notch8", 0.45F, 40, "MILW_Idle", 0.45F, 50, false, "emd_brassbell_1", 15, new String[] {"leslie_s3l_1", "generic_horn_2", "leslie_s3l_1", "leslie_s3l_1", "leslie_s3l_1", "nathan_h6_1", "nathan_h6_2"}),
	ElectricJT7(com.jcirmodelsquad.tcjcir.vehicles.locomotives.ElectricJT7.class, " ", 1F, "MILW_Notch8", 0.45F, 40, "MILW_Idle", 0.45F, 50, false, "alco_bronzebell_3", 18, new String[] {"leslie_a200_3", "leslie_a200_triple_1", "generic_horn_2"}),
	ElectricAEM7(com.jcirmodelsquad.tcjcir.vehicles.locomotives.ElectricAEM7.class, "aem7_horn", 1F, "vl10_idle", 0.45F, 50, "vl10_idle", 0.45F, 50, false, " ", 0),
	ElectricB_BEL(com.jcirmodelsquad.tcjcir.vehicles.locomotives.ElectricB_BEL.class, " ", 0.8F, "vl10_idle", 0.45F, 40, "vl10_idle", 0.45F, 40, false, "emd_steelbell_4", 10, new String[] {"generic_horn_2", "nathan_p3_new_1", "nathan_m5_4", "nathan_k5la_hybrid_1", "generic_horn_1", "leslie_rs5t_3", "fuck_bees"}),

	//PASSENGER//
	PCH120Commute(com.jcirmodelsquad.tcjcir.vehicles.locomotives.PCH120Commute.class, " ", 1F, "mg_run", 0.45F, 8, "mg_idle", 0.45F, 50, false, "transonic_ebell", 11, new String[] {"nathan_p2_1", "eu07_horn", "nathan_p2_1", "lu_whistle", "nathan_k5la_big_2", "eu07_horn"}),
	PCH130Commute2(com.jcirmodelsquad.tcjcir.vehicles.locomotives.PCH130Commute2.class, "mg_horn", 1F, "mg_run", 0.45F, 8, "mg_idle", 0.45F, 50, false, "transonic_ebell", 11),
	AmfleetCab(AmfleetCab.class, "nathan_k5la_big_1", 1F, " ", 0.45F, 51, " ", 0.45F, 50, false, "emd_steelbell_4",10),

	//MISC//
	BigMeme(com.jcirmodelsquad.tcjcir.vehicles.locomotives.BigMeme.class, "leslie_a425", 15, "aircompresser", 0.45F, 88, "aircompresser", 0.45F, 88, false, " ", 0),
	Thanos(com.jcirmodelsquad.tcjcir.vehicles.locomotives.Thanos.class, "thanos_horn", 1, "thanos_run", 0.45F, 82, "thanos_idle", 0.45F, 33, false, " ", 0),
	DieselTGVMobile(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselTGVmobile.class, "carhorn_1", 1F, "GE_HBI_600_Notch8", 0.45F, 80, "GE_HBI_600_Idle", 0.45F, 100, false, " ", 0),
	DieselHHGregg(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselHHgregg.class,"hhgregg600horn", 1F, "hhgregg600_run", 0.45F, 216, "hhgregg600_idle", 0.45F, 216, false, " ", 0),
	ElectricKawasakiLRV(com.jcirmodelsquad.tcjcir.vehicles.locomotives.ElectricKawasakiLRV.class, "tram_bell", 1F, "vl10_idle", 0.45F, 50, "vl10_idle", 0.45F, 50, false, " ", 0),
	ElectricCQ310(com.jcirmodelsquad.tcjcir.vehicles.locomotives.ElectricCQ310PO.class, " ", 1F, "vl10_idle", 0.45F, 50, "vl10_idle", 0.45F, 50, false, " ", 0, new String[] {"subway_horn", "subway_horn", "br_horn"}),
	ElectricPCCCar(com.jcirmodelsquad.tcjcir.vehicles.locomotives.ElectricPCC.class, "tram_bell", 1F, "vl10_idle", 0.45F, 50, "vl10_idle", 0.45F, 50, false, " ", 0),
	ElectricClass74(com.jcirmodelsquad.tcjcir.vehicles.locomotives.ElectricClass74.class, " ", 0.8F, "chme3_idle", 0.65F, 40, "chme3_idle", 0.65F, 40, false, " ", 0, new String[] {"br_horn", "br_horn", "nathan_p2_1", "br_horn", "br_horn"}),
	ElectricTwoBil(com.jcirmodelsquad.tcjcir.vehicles.locomotives.ElectricTwoBil.class, "br_horn", 0.8F, "vl10_idle", 0.6F, 50, "vl10_idle", 0.6F, 50, false, " ", 0),
	DieselWorkdayHyrail(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselWorkdayHyrail.class, " ", 1F, "GE_HBI_600_Notch8", 0.45F, 80, "GE_HBI_600_Idle", 0.45F, 100, false, " ", 0, new String[] {"carhorn_1", "carhorn_1", "buell_b3_1", "nathan_m5_4", "carhorn_1", "carhorn_1", "carhorn_1"}),

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
