// base class GxEPD2_GFX can be used to pass references or pointers to the display instance as parameter, uses ~1.2k more code
// enable or disable GxEPD2_GFX base class
#define ENABLE_GxEPD2_GFX 0

#include <GxEPD2.h>
#include <GxEPD2_3C.h>
#include <GxEPD2_EPD.h>
#include <GxEPD2_GFX.h>

#include <Adafruit_GFX.h>
#include <Adafruit_GrayOLED.h>
#include <Adafruit_SPITFT.h>
#include <Adafruit_SPITFT_Macros.h>
#include <gfxfont.h>

#include <Fonts/FreeMonoBold9pt7b.h>

// ESP32-C3 CS(SS)=7,SCL(SCK)=4,SDA(MOSI)=6,BUSY=3,RES(RST)=2,DC=1
#define CS_PIN (SS)
#define BUSY_PIN (3)
#define RES_PIN (2)
#define DC_PIN (1)

// 2.9'' EPD Module
GxEPD2_3C<GxEPD2_290_C90c, GxEPD2_290_C90c::HEIGHT> display(GxEPD2_290_C90c(/*CS=5*/ CS_PIN, /*DC=*/DC_PIN, /*RES=*/RES_PIN, /*BUSY=*/BUSY_PIN));  // GDEM029C90 128x296, SSD1680

void setup() {
  pinMode(8, OUTPUT);
  digitalWrite(8, HIGH);

  display.init(115200, true, 50, false);
  display.hibernate();
}

const char HelloWorld[] = "Hello World!";
const char HelloWeACtStudio[] = "WeAct Studio";

void textFullScreen(String text) {
  display.setRotation(3);
  display.setFont(&FreeMonoBold9pt7b);
  display.setTextColor(GxEPD_BLACK);
  int16_t tbx, tby;
  uint16_t tbw, tbh;
  display.getTextBounds(text, 0, 0, &tbx, &tby, &tbw, &tbh);
  // center the bounding box by transposition of the origin:
  uint16_t x = ((display.width() - tbw) / 2) - tbx;
  uint16_t y = ((display.height() - tbh) / 2) - tby;
  display.setFullWindow();
  display.firstPage();
  do {
    display.fillScreen(GxEPD_WHITE);
    display.setCursor(x, y - tbh);
    display.print(text);
//    display.setTextColor(display.epd2.hasColor ? GxEPD_RED : GxEPD_BLACK);
  } while (display.nextPage());
}

void loop() {
  if (Serial.available()) {
    String inputText = Serial.readString();
    inputText.trim();a
    textFullScreen(inputText);
  }
}