package d2;

import B1.AbstractC0015b;
import j3.D;
import j3.G;
import j3.X;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: d2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0788d {
    public static final String[] a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f11233b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f11234c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c6, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static K2.C0298b a(java.lang.String r20) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, java.lang.NumberFormatException {
        /*
            r0 = 1
            org.xmlpull.v1.XmlPullParserFactory r1 = org.xmlpull.v1.XmlPullParserFactory.newInstance()
            org.xmlpull.v1.XmlPullParser r1 = r1.newPullParser()
            java.io.StringReader r2 = new java.io.StringReader
            r3 = r20
            r2.<init>(r3)
            r1.setInput(r2)
            r1.next()
            java.lang.String r2 = "x:xmpmeta"
            boolean r3 = B1.AbstractC0015b.s(r1, r2)
            r4 = 0
            if (r3 == 0) goto Lcd
            j3.E r3 = j3.G.f12277l
            j3.X r3 = j3.X.f12304o
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r5
        L29:
            r1.next()
            java.lang.String r9 = "rdf:Description"
            boolean r9 = B1.AbstractC0015b.s(r1, r9)
            if (r9 == 0) goto L99
            java.lang.String[] r3 = d2.AbstractC0788d.a
            r7 = 0
            r8 = r7
        L38:
            r9 = 4
            if (r8 >= r9) goto Lc6
            r10 = r3[r8]
            java.lang.String r10 = B1.AbstractC0015b.p(r1, r10)
            if (r10 == 0) goto L97
            int r3 = java.lang.Integer.parseInt(r10)
            if (r3 != r0) goto Lc6
            java.lang.String[] r3 = d2.AbstractC0788d.f11233b
            r8 = r7
        L4c:
            if (r8 >= r9) goto L60
            r10 = r3[r8]
            java.lang.String r10 = B1.AbstractC0015b.p(r1, r10)
            if (r10 == 0) goto L62
            long r8 = java.lang.Long.parseLong(r10)
            r10 = -1
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 != 0) goto L64
        L60:
            r8 = r5
            goto L64
        L62:
            int r8 = r8 + r0
            goto L4c
        L64:
            java.lang.String[] r3 = d2.AbstractC0788d.f11234c
        L66:
            r10 = 2
            if (r7 >= r10) goto L91
            r10 = r3[r7]
            java.lang.String r10 = B1.AbstractC0015b.p(r1, r10)
            if (r10 == 0) goto L8f
            long r12 = java.lang.Long.parseLong(r10)
            d2.b r14 = new d2.b
            r15 = 0
            r17 = 0
            java.lang.String r19 = "image/jpeg"
            r14.<init>(r15, r17, r19)
            r3 = r14
            d2.b r11 = new d2.b
            r14 = 0
            java.lang.String r16 = "video/mp4"
            r11.<init>(r12, r14, r16)
            j3.X r3 = j3.G.x(r3, r11)
            goto L95
        L8f:
            int r7 = r7 + r0
            goto L66
        L91:
            j3.E r3 = j3.G.f12277l
            j3.X r3 = j3.X.f12304o
        L95:
            r7 = r8
            goto Lba
        L97:
            int r8 = r8 + r0
            goto L38
        L99:
            java.lang.String r9 = "Container:Directory"
            boolean r9 = B1.AbstractC0015b.s(r1, r9)
            if (r9 == 0) goto Laa
            java.lang.String r3 = "Container"
            java.lang.String r9 = "Item"
            j3.X r3 = b(r1, r3, r9)
            goto Lba
        Laa:
            java.lang.String r9 = "GContainer:Directory"
            boolean r9 = B1.AbstractC0015b.s(r1, r9)
            if (r9 == 0) goto Lba
            java.lang.String r3 = "GContainer"
            java.lang.String r9 = "GContainerItem"
            j3.X r3 = b(r1, r3, r9)
        Lba:
            boolean r9 = B1.AbstractC0015b.r(r1, r2)
            if (r9 == 0) goto L29
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto Lc7
        Lc6:
            return r4
        Lc7:
            K2.b r1 = new K2.b
            r1.<init>(r0, r7, r3)
            return r1
        Lcd:
            java.lang.String r0 = "Couldn't find xmp metadata"
            y1.E r0 = y1.E.a(r4, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.AbstractC0788d.a(java.lang.String):K2.b");
    }

    public static X b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        D dR = G.r();
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (AbstractC0015b.s(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strP = AbstractC0015b.p(xmlPullParser, strConcat3);
                String strP2 = AbstractC0015b.p(xmlPullParser, strConcat4);
                String strP3 = AbstractC0015b.p(xmlPullParser, strConcat5);
                String strP4 = AbstractC0015b.p(xmlPullParser, strConcat6);
                if (strP == null || strP2 == null) {
                    return X.f12304o;
                }
                dR.a(new C0786b(strP3 != null ? Long.parseLong(strP3) : 0L, strP4 != null ? Long.parseLong(strP4) : 0L, strP));
            }
        } while (!AbstractC0015b.r(xmlPullParser, strConcat2));
        return dR.f();
    }
}
