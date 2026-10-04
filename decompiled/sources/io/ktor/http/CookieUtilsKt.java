package io.ktor.http;

import O3.t;
import P3.AbstractC0564e;
import e4.InterfaceC0821a;
import e4.k;
import e4.o;
import io.ktor.util.date.Month;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import z5.AbstractC2517v;

@Metadata(d1 = {"\u0000<\n\u0002\u0010\f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u0013\u0010\u0007\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\u0003\u001a%\u0010\u000b\u001a\u00020\t*\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a7\u0010\u0011\u001a\u00020\t*\u00020\r2\u001e\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u000eH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a+\u0010\u0015\u001a\u00020\t*\u00020\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t0\u0013H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a+\u0010\u0017\u001a\u00020\t*\u00020\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u0013H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0016\u001a+\u0010\u0018\u001a\u00020\t*\u00020\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u0013H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0016\u001a\u001b\u0010\u001b\u001a\u00020\t*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\rH\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001d"}, d2 = {"", "", "isDelimiter", "(C)Z", "isNonDelimiter", "isOctet", "isNonDigit", "isDigit", "Lkotlin/Function0;", "LO3/C;", "block", "otherwise", "(ZLe4/a;)V", "", "Lkotlin/Function3;", "", "success", "tryParseTime", "(Ljava/lang/String;Le4/o;)V", "Lkotlin/Function1;", "Lio/ktor/util/date/Month;", "tryParseMonth", "(Ljava/lang/String;Le4/k;)V", "tryParseDayOfMonth", "tryParseYear", "Lio/ktor/http/CookieDateBuilder;", "token", "handleToken", "(Lio/ktor/http/CookieDateBuilder;Ljava/lang/String;)V", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CookieUtilsKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    /* renamed from: io.ktor.http.CookieUtilsKt$tryParseDayOfMonth$1, reason: invalid class name */
    public static final class AnonymousClass1 implements k {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public final Boolean invoke(char c2) {
            return Boolean.valueOf(CookieUtilsKt.isNonDigit(c2));
        }

        @Override // e4.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Character) obj).charValue());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    /* renamed from: io.ktor.http.CookieUtilsKt$tryParseDayOfMonth$2, reason: invalid class name */
    public static final class AnonymousClass2 implements k {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public final Boolean invoke(char c2) {
            return Boolean.valueOf(CookieUtilsKt.isOctet(c2));
        }

        @Override // e4.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Character) obj).charValue());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    /* renamed from: io.ktor.http.CookieUtilsKt$tryParseTime$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12171 implements k {
        public static final C12171 INSTANCE = new C12171();

        public final Boolean invoke(char c2) {
            return Boolean.valueOf(c2 == ':');
        }

        @Override // e4.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Character) obj).charValue());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    /* renamed from: io.ktor.http.CookieUtilsKt$tryParseTime$3, reason: invalid class name */
    public static final class AnonymousClass3 implements k {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public final Boolean invoke(char c2) {
            return Boolean.valueOf(c2 == ':');
        }

        @Override // e4.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Character) obj).charValue());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    /* renamed from: io.ktor.http.CookieUtilsKt$tryParseTime$5, reason: invalid class name */
    public static final class AnonymousClass5 implements k {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        public final Boolean invoke(char c2) {
            return Boolean.valueOf(CookieUtilsKt.isNonDigit(c2));
        }

        @Override // e4.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Character) obj).charValue());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    /* renamed from: io.ktor.http.CookieUtilsKt$tryParseTime$6, reason: invalid class name */
    public static final class AnonymousClass6 implements k {
        public static final AnonymousClass6 INSTANCE = new AnonymousClass6();

        public final Boolean invoke(char c2) {
            return Boolean.valueOf(CookieUtilsKt.isOctet(c2));
        }

        @Override // e4.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Character) obj).charValue());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    /* renamed from: io.ktor.http.CookieUtilsKt$tryParseYear$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12181 implements k {
        public static final C12181 INSTANCE = new C12181();

        public final Boolean invoke(char c2) {
            return Boolean.valueOf(CookieUtilsKt.isNonDigit(c2));
        }

        @Override // e4.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Character) obj).charValue());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    /* renamed from: io.ktor.http.CookieUtilsKt$tryParseYear$2, reason: invalid class name and case insensitive filesystem */
    public static final class C12192 implements k {
        public static final C12192 INSTANCE = new C12192();

        public final Boolean invoke(char c2) {
            return Boolean.valueOf(CookieUtilsKt.isOctet(c2));
        }

        @Override // e4.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Character) obj).charValue());
        }
    }

    public static final void handleToken(CookieDateBuilder cookieDateBuilder, String str) {
        l.f("<this>", cookieDateBuilder);
        l.f("token", str);
        if (cookieDateBuilder.getHours() == null || cookieDateBuilder.getMinutes() == null || cookieDateBuilder.getSeconds() == null) {
            StringLexer stringLexer = new StringLexer(str);
            int index = stringLexer.getIndex();
            if (stringLexer.accept(CookieUtilsKt$tryParseTime$hour$1$1.INSTANCE)) {
                stringLexer.accept(CookieUtilsKt$tryParseTime$hour$1$3.INSTANCE);
                String strSubstring = stringLexer.getSource().substring(index, stringLexer.getIndex());
                l.e("substring(...)", strSubstring);
                int i7 = Integer.parseInt(strSubstring);
                if (stringLexer.accept(C12171.INSTANCE)) {
                    int index2 = stringLexer.getIndex();
                    if (stringLexer.accept(CookieUtilsKt$tryParseTime$minute$1$1.INSTANCE)) {
                        stringLexer.accept(CookieUtilsKt$tryParseTime$minute$1$3.INSTANCE);
                        String strSubstring2 = stringLexer.getSource().substring(index2, stringLexer.getIndex());
                        l.e("substring(...)", strSubstring2);
                        int i8 = Integer.parseInt(strSubstring2);
                        if (stringLexer.accept(AnonymousClass3.INSTANCE)) {
                            int index3 = stringLexer.getIndex();
                            if (stringLexer.accept(CookieUtilsKt$tryParseTime$second$1$1.INSTANCE)) {
                                stringLexer.accept(CookieUtilsKt$tryParseTime$second$1$3.INSTANCE);
                                String strSubstring3 = stringLexer.getSource().substring(index3, stringLexer.getIndex());
                                l.e("substring(...)", strSubstring3);
                                int i9 = Integer.parseInt(strSubstring3);
                                if (stringLexer.accept(AnonymousClass5.INSTANCE)) {
                                    stringLexer.acceptWhile(AnonymousClass6.INSTANCE);
                                }
                                cookieDateBuilder.setHours(Integer.valueOf(i7));
                                cookieDateBuilder.setMinutes(Integer.valueOf(i8));
                                cookieDateBuilder.setSeconds(Integer.valueOf(i9));
                                return;
                            }
                        }
                    }
                }
            }
        }
        if (cookieDateBuilder.getDayOfMonth() == null) {
            StringLexer stringLexer2 = new StringLexer(str);
            int index4 = stringLexer2.getIndex();
            if (stringLexer2.accept(CookieUtilsKt$tryParseDayOfMonth$day$1$1.INSTANCE)) {
                stringLexer2.accept(CookieUtilsKt$tryParseDayOfMonth$day$1$3.INSTANCE);
                String strSubstring4 = stringLexer2.getSource().substring(index4, stringLexer2.getIndex());
                l.e("substring(...)", strSubstring4);
                int i10 = Integer.parseInt(strSubstring4);
                if (stringLexer2.accept(AnonymousClass1.INSTANCE)) {
                    stringLexer2.acceptWhile(AnonymousClass2.INSTANCE);
                }
                cookieDateBuilder.setDayOfMonth(Integer.valueOf(i10));
                return;
            }
        }
        if (cookieDateBuilder.getMonth() == null && str.length() >= 3) {
            AbstractC0564e abstractC0564e = (AbstractC0564e) Month.getEntries();
            abstractC0564e.getClass();
            t tVar = new t(4, abstractC0564e);
            while (tVar.hasNext()) {
                Month month = (Month) tVar.next();
                if (AbstractC2517v.T(str, month.getValue(), true)) {
                    cookieDateBuilder.setMonth(month);
                    return;
                }
            }
        }
        if (cookieDateBuilder.getYear() == null) {
            StringLexer stringLexer3 = new StringLexer(str);
            int index5 = stringLexer3.getIndex();
            for (int i11 = 0; i11 < 2; i11++) {
                if (!stringLexer3.accept(CookieUtilsKt$tryParseYear$year$1$1$1.INSTANCE)) {
                    return;
                }
            }
            for (int i12 = 0; i12 < 2; i12++) {
                stringLexer3.accept(CookieUtilsKt$tryParseYear$year$1$2$1.INSTANCE);
            }
            String strSubstring5 = stringLexer3.getSource().substring(index5, stringLexer3.getIndex());
            l.e("substring(...)", strSubstring5);
            int i13 = Integer.parseInt(strSubstring5);
            if (stringLexer3.accept(C12181.INSTANCE)) {
                stringLexer3.acceptWhile(C12192.INSTANCE);
            }
            cookieDateBuilder.setYear(Integer.valueOf(i13));
        }
    }

    public static final boolean isDelimiter(char c2) {
        if (c2 == '\t') {
            return true;
        }
        if (' ' <= c2 && c2 < '0') {
            return true;
        }
        if (';' <= c2 && c2 < 'A') {
            return true;
        }
        if ('[' > c2 || c2 >= 'a') {
            return '{' <= c2 && c2 < 127;
        }
        return true;
    }

    public static final boolean isDigit(char c2) {
        return '0' <= c2 && c2 < ':';
    }

    public static final boolean isNonDelimiter(char c2) {
        if (c2 >= 0 && c2 < '\t') {
            return true;
        }
        if ('\n' <= c2 && c2 < ' ') {
            return true;
        }
        if (('0' <= c2 && c2 < ':') || c2 == ':') {
            return true;
        }
        if ('a' <= c2 && c2 < '{') {
            return true;
        }
        if ('A' > c2 || c2 >= '[') {
            return 127 <= c2 && c2 < 256;
        }
        return true;
    }

    public static final boolean isNonDigit(char c2) {
        if (c2 < 0 || c2 >= '0') {
            return 'J' <= c2 && c2 < 256;
        }
        return true;
    }

    public static final boolean isOctet(char c2) {
        return c2 >= 0 && c2 < 256;
    }

    public static final void otherwise(boolean z7, InterfaceC0821a interfaceC0821a) {
        l.f("block", interfaceC0821a);
        if (z7) {
            return;
        }
        interfaceC0821a.invoke();
    }

    public static final void tryParseDayOfMonth(String str, k kVar) throws NumberFormatException {
        l.f("<this>", str);
        l.f("success", kVar);
        StringLexer stringLexer = new StringLexer(str);
        int index = stringLexer.getIndex();
        if (stringLexer.accept(CookieUtilsKt$tryParseDayOfMonth$day$1$1.INSTANCE)) {
            stringLexer.accept(CookieUtilsKt$tryParseDayOfMonth$day$1$3.INSTANCE);
            String strSubstring = stringLexer.getSource().substring(index, stringLexer.getIndex());
            l.e("substring(...)", strSubstring);
            int i7 = Integer.parseInt(strSubstring);
            if (stringLexer.accept(AnonymousClass1.INSTANCE)) {
                stringLexer.acceptWhile(AnonymousClass2.INSTANCE);
            }
            kVar.invoke(Integer.valueOf(i7));
        }
    }

    public static final void tryParseMonth(String str, k kVar) {
        l.f("<this>", str);
        l.f("success", kVar);
        if (str.length() < 3) {
            return;
        }
        AbstractC0564e abstractC0564e = (AbstractC0564e) Month.getEntries();
        abstractC0564e.getClass();
        t tVar = new t(4, abstractC0564e);
        while (tVar.hasNext()) {
            Month month = (Month) tVar.next();
            if (AbstractC2517v.T(str, month.getValue(), true)) {
                kVar.invoke(month);
                return;
            }
        }
    }

    public static final void tryParseTime(String str, o oVar) throws NumberFormatException {
        l.f("<this>", str);
        l.f("success", oVar);
        StringLexer stringLexer = new StringLexer(str);
        int index = stringLexer.getIndex();
        if (stringLexer.accept(CookieUtilsKt$tryParseTime$hour$1$1.INSTANCE)) {
            stringLexer.accept(CookieUtilsKt$tryParseTime$hour$1$3.INSTANCE);
            String strSubstring = stringLexer.getSource().substring(index, stringLexer.getIndex());
            l.e("substring(...)", strSubstring);
            int i7 = Integer.parseInt(strSubstring);
            if (stringLexer.accept(C12171.INSTANCE)) {
                int index2 = stringLexer.getIndex();
                if (stringLexer.accept(CookieUtilsKt$tryParseTime$minute$1$1.INSTANCE)) {
                    stringLexer.accept(CookieUtilsKt$tryParseTime$minute$1$3.INSTANCE);
                    String strSubstring2 = stringLexer.getSource().substring(index2, stringLexer.getIndex());
                    l.e("substring(...)", strSubstring2);
                    int i8 = Integer.parseInt(strSubstring2);
                    if (stringLexer.accept(AnonymousClass3.INSTANCE)) {
                        int index3 = stringLexer.getIndex();
                        if (stringLexer.accept(CookieUtilsKt$tryParseTime$second$1$1.INSTANCE)) {
                            stringLexer.accept(CookieUtilsKt$tryParseTime$second$1$3.INSTANCE);
                            String strSubstring3 = stringLexer.getSource().substring(index3, stringLexer.getIndex());
                            l.e("substring(...)", strSubstring3);
                            int i9 = Integer.parseInt(strSubstring3);
                            if (stringLexer.accept(AnonymousClass5.INSTANCE)) {
                                stringLexer.acceptWhile(AnonymousClass6.INSTANCE);
                            }
                            oVar.invoke(Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9));
                        }
                    }
                }
            }
        }
    }

    public static final void tryParseYear(String str, k kVar) throws NumberFormatException {
        l.f("<this>", str);
        l.f("success", kVar);
        StringLexer stringLexer = new StringLexer(str);
        int index = stringLexer.getIndex();
        for (int i7 = 0; i7 < 2; i7++) {
            if (!stringLexer.accept(CookieUtilsKt$tryParseYear$year$1$1$1.INSTANCE)) {
                return;
            }
        }
        for (int i8 = 0; i8 < 2; i8++) {
            stringLexer.accept(CookieUtilsKt$tryParseYear$year$1$2$1.INSTANCE);
        }
        String strSubstring = stringLexer.getSource().substring(index, stringLexer.getIndex());
        l.e("substring(...)", strSubstring);
        int i9 = Integer.parseInt(strSubstring);
        if (stringLexer.accept(C12181.INSTANCE)) {
            stringLexer.acceptWhile(C12192.INSTANCE);
        }
        kVar.invoke(Integer.valueOf(i9));
    }
}
