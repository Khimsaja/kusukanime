package io.ktor.http;

import b1.AbstractC0703b;
import e4.InterfaceC0821a;
import io.ktor.http.ContentDisposition;
import io.ktor.util.date.GMTDate;
import k4.g;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\n\u001a\u00020\t\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lio/ktor/http/CookieDateParser;", "", "<init>", "()V", "T", "", "source", ContentDisposition.Parameters.Name, "field", "LO3/C;", "checkFieldNotNull", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "", "requirement", "Lkotlin/Function0;", "msg", "checkRequirement", "(Ljava/lang/String;ZLe4/a;)V", "Lio/ktor/util/date/GMTDate;", "parse", "(Ljava/lang/String;)Lio/ktor/util/date/GMTDate;", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CookieDateParser {
    private final <T> void checkFieldNotNull(String source, String name, T field) {
        if (field == null) {
            throw new InvalidCookieDateException(source, AbstractC0703b.i("Could not find ", name));
        }
    }

    private final void checkRequirement(String source, boolean requirement, InterfaceC0821a msg) {
        if (!requirement) {
            throw new InvalidCookieDateException(source, (String) msg.invoke());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String parse$lambda$5() {
        return "day-of-month not in [1,31]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String parse$lambda$6() {
        return "year >= 1601";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String parse$lambda$7() {
        return "hours > 23";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String parse$lambda$8() {
        return "minutes > 59";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String parse$lambda$9() {
        return "seconds > 59";
    }

    public final GMTDate parse(String source) {
        l.f("source", source);
        StringLexer stringLexer = new StringLexer(source);
        CookieDateBuilder cookieDateBuilder = new CookieDateBuilder();
        stringLexer.acceptWhile(new io.ktor.client.request.a(11));
        while (stringLexer.getHasRemaining()) {
            if (stringLexer.test(new io.ktor.client.request.a(12))) {
                int index = stringLexer.getIndex();
                stringLexer.acceptWhile(new io.ktor.client.request.a(13));
                String strSubstring = stringLexer.getSource().substring(index, stringLexer.getIndex());
                l.e("substring(...)", strSubstring);
                CookieUtilsKt.handleToken(cookieDateBuilder, strSubstring);
                stringLexer.acceptWhile(new io.ktor.client.request.a(14));
            }
        }
        Integer year = cookieDateBuilder.getYear();
        g gVar = new g(70, 99, 1);
        if (year == null || !gVar.h(year.intValue())) {
            g gVar2 = new g(0, 69, 1);
            if (year != null && gVar2.h(year.intValue())) {
                Integer year2 = cookieDateBuilder.getYear();
                l.c(year2);
                cookieDateBuilder.setYear(Integer.valueOf(year2.intValue() + 2000));
            }
        } else {
            Integer year3 = cookieDateBuilder.getYear();
            l.c(year3);
            cookieDateBuilder.setYear(Integer.valueOf(year3.intValue() + 1900));
        }
        checkFieldNotNull(source, "day-of-month", cookieDateBuilder.getDayOfMonth());
        checkFieldNotNull(source, "month", cookieDateBuilder.getMonth());
        checkFieldNotNull(source, "year", cookieDateBuilder.getYear());
        checkFieldNotNull(source, "time", cookieDateBuilder.getHours());
        checkFieldNotNull(source, "time", cookieDateBuilder.getMinutes());
        checkFieldNotNull(source, "time", cookieDateBuilder.getSeconds());
        g gVar3 = new g(1, 31, 1);
        Integer dayOfMonth = cookieDateBuilder.getDayOfMonth();
        checkRequirement(source, dayOfMonth != null && gVar3.h(dayOfMonth.intValue()), new c(2));
        Integer year4 = cookieDateBuilder.getYear();
        l.c(year4);
        checkRequirement(source, year4.intValue() >= 1601, new c(3));
        Integer hours = cookieDateBuilder.getHours();
        l.c(hours);
        checkRequirement(source, hours.intValue() <= 23, new c(4));
        Integer minutes = cookieDateBuilder.getMinutes();
        l.c(minutes);
        checkRequirement(source, minutes.intValue() <= 59, new c(5));
        Integer seconds = cookieDateBuilder.getSeconds();
        l.c(seconds);
        checkRequirement(source, seconds.intValue() <= 59, new c(6));
        return cookieDateBuilder.build();
    }
}
