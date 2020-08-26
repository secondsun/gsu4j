package dev.secondsun.snes.gsu4j;

public class Registers {

    int pipeline;//byte
    int ramaddr;//short

    Register[] r = new Register[16];   //general purpose registers

    /*
    uint8 pipeline;
  uint16 ramaddr;

  Register r[16];   //general purpose registers
  SFR sfr;          //status flag register
  uint8 pbr;        //program bank register
  uint8 rombr;      //game pack ROM bank register
  bool rambr;       //game pack RAM bank register
  uint16 cbr;       //cache base register
  uint8 scbr;       //screen base register
  SCMR scmr;        //screen mode register
  uint8 colr;       //color register
  POR por;          //plot option register
  bool bramr;       //back-up RAM register
  uint8 vcr;        //version code register
  CFGR cfgr;        //config register
  bool clsr;        //clock select register

  uint romcl;       //clock ticks until romdr is valid
  uint8 romdr;      //ROM buffer data register

  uint ramcl;       //clock ticks until ramdr is valid
  uint16 ramar;     //RAM buffer address register
  uint8 ramdr;      //RAM buffer data register

  uint sreg;
  uint dreg;
  auto& sr() { return r[sreg]; }  //source register (from)
  auto& dr() { return r[dreg]; }  //destination register (to)

  auto reset() -> void {
    sfr.b    = 0;
    sfr.alt1 = 0;
    sfr.alt2 = 0;

    sreg = 0;
    dreg = 0;
  }
     */
}
