package F2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import i1.C1036A;
import i1.C1040E;

/* loaded from: classes.dex */
public final class x extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2463b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2464c;

    public /* synthetic */ x(y yVar, C0163t c0163t, int i7) {
        this.a = i7;
        this.f2464c = yVar;
        this.f2463b = c0163t;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                y yVar = (y) this.f2464c;
                yVar.i(1);
                if (yVar.f2466B) {
                    ((C0163t) this.f2463b).post(yVar.f2485s);
                    yVar.f2466B = false;
                    break;
                }
                break;
            case 1:
                y yVar2 = (y) this.f2464c;
                yVar2.i(2);
                if (yVar2.f2466B) {
                    ((C0163t) this.f2463b).post(yVar2.f2485s);
                    yVar2.f2466B = false;
                    break;
                }
                break;
            case 2:
                y yVar3 = (y) this.f2464c;
                yVar3.i(2);
                if (yVar3.f2466B) {
                    ((C0163t) this.f2463b).post(yVar3.f2485s);
                    yVar3.f2466B = false;
                    break;
                }
                break;
            default:
                C1040E c1040e = (C1040E) this.f2463b;
                c1040e.a.c(1.0f);
                C1036A.d((View) this.f2464c, c1040e);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                ((y) this.f2464c).i(3);
                break;
            case 1:
                ((y) this.f2464c).i(3);
                break;
            case 2:
                ((y) this.f2464c).i(3);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public x(View view, C1040E c1040e) {
        this.a = 3;
        this.f2463b = c1040e;
        this.f2464c = view;
    }
}
