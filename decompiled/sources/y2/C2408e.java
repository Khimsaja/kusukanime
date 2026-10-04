package y2;

import B1.AbstractC0015b;
import B1.C0017d;
import B1.InterfaceC0021h;
import B1.K;
import D.P0;
import b1.AbstractC0703b;
import io.ktor.http.ContentType;
import io.ktor.sse.ServerSentEventKt;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import s2.C1978f;
import s2.C1981i;
import s2.InterfaceC1976d;
import s2.InterfaceC1982j;

/* renamed from: y2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2408e implements InterfaceC1982j {

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f18190l = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f18191m = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: n, reason: collision with root package name */
    public static final Pattern f18192n = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: o, reason: collision with root package name */
    public static final Pattern f18193o = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: p, reason: collision with root package name */
    public static final Pattern f18194p = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f18195q = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f18196r = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: s, reason: collision with root package name */
    public static final C2407d f18197s = new C2407d(30.0f, 1, 1);

    /* renamed from: k, reason: collision with root package name */
    public final XmlPullParserFactory f18198k;

    public C2408e() throws XmlPullParserException {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f18198k = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e7) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e7);
        }
    }

    public static C2410g a(C2410g c2410g) {
        return c2410g == null ? new C2410g() : c2410g;
    }

    public static boolean b(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals(ContentType.Image.TYPE) || str.equals("data") || str.equals("information");
    }

    public static int c(XmlPullParser xmlPullParser) throws NumberFormatException {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = f18196r.matcher(attributeValue);
        if (!matcher.matches()) {
            AbstractC0015b.v("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        boolean z7 = true;
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i7 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            int i8 = Integer.parseInt(strGroup2);
            if (i7 == 0 || i8 == 0) {
                z7 = false;
            }
            AbstractC0015b.b("Invalid cell resolution " + i7 + ServerSentEventKt.SPACE + i8, z7);
            return i8;
        } catch (NumberFormatException unused) {
            AbstractC0015b.v("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    public static void d(String str, C2410g c2410g) throws C1978f {
        Matcher matcher;
        String strGroup;
        int i7 = K.a;
        String[] strArrSplit = str.split("\\s+", -1);
        int length = strArrSplit.length;
        Pattern pattern = f18192n;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                throw new C1978f("Invalid number of entries for fontSize: " + strArrSplit.length + ".");
            }
            matcher = pattern.matcher(strArrSplit[1]);
            AbstractC0015b.v("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new C1978f(AbstractC0703b.j("Invalid expression for fontSize: '", str, "'."));
        }
        strGroup = matcher.group(3);
        strGroup.getClass();
        switch (strGroup) {
            case "%":
                c2410g.f18216j = 3;
                break;
            case "em":
                c2410g.f18216j = 2;
                break;
            case "px":
                c2410g.f18216j = 1;
                break;
            default:
                throw new C1978f(AbstractC0703b.j("Invalid unit for fontSize: '", strGroup, "'."));
        }
        String strGroup2 = matcher.group(1);
        strGroup2.getClass();
        c2410g.f18217k = Float.parseFloat(strGroup2);
    }

    public static C2407d e(XmlPullParser xmlPullParser) throws NumberFormatException {
        float f5;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i7 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i8 = K.a;
            AbstractC0015b.b("frameRateMultiplier doesn't have 2 parts", attributeValue2.split(ServerSentEventKt.SPACE, -1).length == 2);
            f5 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f5 = 1.0f;
        }
        C2407d c2407d = f18197s;
        int i9 = c2407d.f18188b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i9 = Integer.parseInt(attributeValue3);
        }
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        return new C2407d(i7 * f5, i9, attributeValue4 != null ? Integer.parseInt(attributeValue4) : c2407d.f18189c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0268 A[LOOP:0: B:3:0x000a->B:120:0x0268, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0267 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void f(org.xmlpull.v1.XmlPullParser r22, java.util.HashMap r23, int r24, D.P0 r25, java.util.HashMap r26, java.util.HashMap r27) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.C2408e.f(org.xmlpull.v1.XmlPullParser, java.util.HashMap, int, D.P0, java.util.HashMap, java.util.HashMap):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static y2.C2406c g(org.xmlpull.v1.XmlPullParser r23, y2.C2406c r24, java.util.HashMap r25, y2.C2407d r26) throws s2.C1978f, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.C2408e.g(org.xmlpull.v1.XmlPullParser, y2.c, java.util.HashMap, y2.d):y2.c");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:200)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.processFallThroughCases(SwitchRegionMaker.java:105)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:124)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static y2.C2410g i(org.xmlpull.v1.XmlPullParser r21, y2.C2410g r22) {
        /*
            Method dump skipped, instructions count: 1698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.C2408e.i(org.xmlpull.v1.XmlPullParser, y2.g):y2.g");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long j(java.lang.String r13, y2.C2407d r14) throws s2.C1978f, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.C2408e.j(java.lang.String, y2.d):long");
    }

    public static P0 k(XmlPullParser xmlPullParser) throws NumberFormatException {
        String strP = AbstractC0015b.p(xmlPullParser, "extent");
        if (strP == null) {
            return null;
        }
        Matcher matcher = f18195q.matcher(strP);
        if (!matcher.matches()) {
            AbstractC0015b.v("TtmlParser", "Ignoring non-pixel tts extent: ".concat(strP));
            return null;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i7 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            return new P0(i7, Integer.parseInt(strGroup2));
        } catch (NumberFormatException unused) {
            AbstractC0015b.v("TtmlParser", "Ignoring malformed tts extent: ".concat(strP));
            return null;
        }
    }

    @Override // s2.InterfaceC1982j
    public final InterfaceC1976d h(byte[] bArr, int i7, int i8) throws XmlPullParserException, NumberFormatException, IOException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f18198k.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new C2409f("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            P0 p0K = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i7, i8), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            C2407d c2407dE = f18197s;
            int i9 = 0;
            int iC = 15;
            C0017d c0017d = null;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                C2406c c2406c = (C2406c) arrayDeque.peek();
                if (i9 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            c2407dE = e(xmlPullParserNewPullParser);
                            iC = c(xmlPullParserNewPullParser);
                            p0K = k(xmlPullParserNewPullParser);
                        }
                        C2407d c2407d = c2407dE;
                        P0 p02 = p0K;
                        int i10 = iC;
                        if (b(name)) {
                            if ("head".equals(name)) {
                                f(xmlPullParserNewPullParser, map, i10, p02, map2, map3);
                            } else {
                                try {
                                    C2406c c2406cG = g(xmlPullParserNewPullParser, c2406c, map2, c2407d);
                                    arrayDeque.push(c2406cG);
                                    if (c2406c != null) {
                                        if (c2406c.f18187m == null) {
                                            c2406c.f18187m = new ArrayList();
                                        }
                                        c2406c.f18187m.add(c2406cG);
                                    }
                                } catch (C1978f e7) {
                                    AbstractC0015b.w("TtmlParser", "Suppressing parser error", e7);
                                }
                            }
                            iC = i10;
                            p0K = p02;
                            c2407dE = c2407d;
                        } else {
                            AbstractC0015b.q("TtmlParser", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                        }
                        i9++;
                        iC = i10;
                        p0K = p02;
                        c2407dE = c2407d;
                    } else if (eventType == 4) {
                        c2406c.getClass();
                        C2406c c2406cA = C2406c.a(xmlPullParserNewPullParser.getText());
                        if (c2406c.f18187m == null) {
                            c2406c.f18187m = new ArrayList();
                        }
                        c2406c.f18187m.add(c2406cA);
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            C2406c c2406c2 = (C2406c) arrayDeque.peek();
                            c2406c2.getClass();
                            c0017d = new C0017d(c2406c2, map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i9++;
                } else if (eventType == 3) {
                    i9--;
                }
                xmlPullParserNewPullParser.next();
            }
            c0017d.getClass();
            return c0017d;
        } catch (IOException e8) {
            throw new IllegalStateException("Unexpected error when reading input.", e8);
        } catch (XmlPullParserException e9) {
            throw new IllegalStateException("Unable to decode source", e9);
        }
    }

    @Override // s2.InterfaceC1982j
    public final void p(byte[] bArr, int i7, int i8, C1981i c1981i, InterfaceC0021h interfaceC0021h) {
        e3.c.H(h(bArr, i7, i8), c1981i, interfaceC0021h);
    }
}
