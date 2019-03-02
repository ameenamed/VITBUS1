package com.example.android.vitbus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Main5Activity extends AppCompatActivity {

    private ArrayList<String> mNames=new ArrayList<>();
    private ArrayList<String> mdes=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        initroutes();
    }
    private void initroutes()
    {
        mNames.add("Route 1");
        mNames.add("Route 2");
        mNames.add("Route 3");mNames.add("Route 4");mNames.add("Route 5");mNames.add("Route 6");mNames.add("Route 7");mNames.add("Route 8");
        mNames.add("Route 9");mNames.add("Route 10");mNames.add("Route 11");mNames.add("Route 12");
        mNames.add("Route 13");mNames.add("Route 14");mNames.add("Route 15");mNames.add("Route 16");mNames.add("Route 17");mNames.add("Route 18");
        mNames.add("Route 19");mNames.add("Route 20");
        String r13="Parry's Corner->Central Rly Station->Ribbon Building->Dasprkash->Ega->Pachaiyappas->Aminjikarai->D.G.Vaishnava->Maduravoyal->Porur Toll->Perungalathur->Vandalur->VIT Chennai";
        String r1="Anna Nagar West Depot->Thirumangalam->Golden Flats->Wavin->Nolambur->Toll Plaze->Porur Bridge->Perungalathur->VIT Chennai";
        String r2="Shanthi Colony->Anna Nagar Rountana->Nadhamuni ICF->Anna Nagar West Depot->Thirumangalam->Golden Flats->Wavin->Nolambur->Toll Plaze->Porur Bridge->Perungalathur->VIT Chennai";
        String r3="Thirumangalam->Golden Flats->Wavin->Nolambur->Toll Plaze->Porur Bridge->Perungalathur->VIT Chennai";
        String r4="Perambur Church->Venus->Thiru. VI.KA Nagar->Kolathur Police Station->Padi Bridge->Ambattur Estate->Dunlop->Nolambur->Toll Plaza->Perungalathur->VIT Chennai";
        String r5="PURASAWAKKAM->DASAPRAKASH->GENGU REDDY SUB WAY->CHETPET->LOYOLA COLLEGE->VALLUVAR KOTTAM->LIBERTY->ASHOK PILLAR->KASI THEATRE->KATHIPARA->VELACHERY->MEDAVAKKAM->VIT CHENNAI";
        String r6="CMBT->VADAPALANI->VIRUGAMPAKKAM->VALASARAVAKKAM->PORUR->KOVOOR->KUNDRATHUR BYE PASS->VANDALUR->VIT UNIVERSITY";
        String r7="CHINMIYA NAGAR->VIRUGAMPAKKAM->PORUR->NANTHAMBAKKAM->KATHIPARA->PALLAVARAM->CHROMPET->TAMBARAM->VIT UNIVERSITY";
        String r8="EGMORE PANTHEON ROAD->STERLING ROAD->VALLUVAR KOTTAM->POTHYS->AYOTHAVA MANDAPAM->ASHOK PILLAR->KASI THEATRE->KATHIPARA->VELACHERY RLY STATION->VIT ";
        String r9="AYANAVARAM->ESI HOSPITAL->KILPAKKAM GARDEN->PACHAIYAPPAS->AMINJIKARAI->D.G. VAISHNAVA->MADURAVOYAL->PORUR TOLL->PERUNGALATHUR->VANDALUR->VIT UNIVERSITY";
        String r10="MADHAVARAM ROUNTANA->PUZHAL CAMP->KALLIKUPPAM->PUDHUR->RAKKI THEATRE->THIRUMULLAIVOYAL->AVADI->PATTABIRAM->NEMILICHERRY->MANNIVAKKAM->VANDALUR->VIT UNIVERSITY";
        String r11="NANDANAM SINGAL->SAIDAPET->GUINDY RACE COURSE->ADAMBAKKAM->MADIPAKKAM KOOT ROAD->KEELKATTALAI->MEDAVAKKAM->VIT UNIVERSITY";
        String r12="KANNAGI STATUE->TRIPLICANE->ROYAPETTAH->ALWARPET JUNCTION->CHEMIERS ROAD JUNCTION->KOTTURAPURAM BRIDGE->IIT->MADHYA KAILASH->TARAMANI->BABY NAGAR ->PALLIKARANI->MEDAVAKKAM MAAMBAKKAM JUNCTION->VIT UNIVERSTIY";
        String r14="ADAYAR AAVIN->BESANT NAGAR THEOSOPHICAL SOCIETY->BESANT NAGAR->VANNANDURAI->ADYAR DEPOT.->THIRUVANMIYUR BUS STAND->NELANGARAI->SHOLINGANALUR->MEDAVAKKAM->MAMBAKKAM->VIT UNIVERSITY";
        String r15="LUZ->MYLAPORE TANK->MANDAVELI->MOOPANAR BRIDGE->KOTTUR PURAM->GANDHI MANDAPAM->RACE COURSE ROAD->VELACHERY BUS STAND->PALLIKARANAI->SEMBAKKAM->KOZHIPANNAI->PONMAR->VIT UNIVERSITY";
        String r16="KUNDRATHUR->ANAGAPUTHUR BUS STAND->PAMMAL->PALLAVARAM->CHROMPET->BHARATH MADHA KOVIL STREET->VIT UNIVERSITY";
        String r17="AIR->SANTHOME->SATHYA STUDIO->ADAYAR AAVIN->MADHYA KAILASH->SRP TOOLS->THORAIPAKKAM->SHOLINGANALLUR->NAVALUR->VIT UNIVERSITY";
        String r18="MANDAVELI->ADAYAR AAVIN->ADAYAR DEPOT.->THIRUVANMIYUR->SRP TOOLS->BABY NAGAR->PALIKARANAI->MEDAVAKKAM->VIT UNIVERSITY";
        String r19="MARAIMALAI NAGAR->GUDUVANCHERY->URAPAKKAM->VANDALUR ZOO->VIT UNIVERSITY";
        String r20="MIT BRIDGE ->CHITLAPAKKAM->BHARADHAMADHA KOIL STREET->MAHALAKSHMI NAGAR->CAMP ROAD->VIT UNIVERSITY";
        mdes.add(r1);
        mdes.add(r2);
        mdes.add(r3);mdes.add(r4);mdes.add(r5);mdes.add(r6);mdes.add(r7);mdes.add(r8);mdes.add(r9);mdes.add(r10);mdes.add(r11);mdes.add(r12);
        mdes.add(r13);mdes.add(r14);mdes.add(r15);mdes.add(r16);mdes.add(r17);mdes.add(r18);mdes.add(r19);mdes.add(r20);
        initRecyclerView();

    }
    private void initRecyclerView()
    {
        RecyclerView recyclerView=findViewById(R.id.recylerview);
        RecyclerViewAdapter adapter=new RecyclerViewAdapter(mNames,mdes,this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
