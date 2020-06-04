package com.example.mywechat;

/**
 * Created by WangChang on 2016/4/3.
 */
public class ImageUtil {

    public final static String[] imageUrls = new String[]{
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1591255544960&di=24fc9da6996c25fce11ac8640f6b1908&imgtype=0&src=http%3A%2F%2Fa3.att.hudong.com%2F14%2F75%2F01300000164186121366756803686.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1591255544960&di=f7d52a2602ea9428542ce468bce762fe&imgtype=0&src=http%3A%2F%2Fa2.att.hudong.com%2F36%2F48%2F19300001357258133412489354717.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1591255544959&di=a05c16984231c7a18c3b838d6663bddd&imgtype=0&src=http%3A%2F%2Fa0.att.hudong.com%2F64%2F76%2F20300001349415131407760417677.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1591255544959&di=af15bfaf0672e2f496ec361e182cfc4f&imgtype=0&src=http%3A%2F%2Fa3.att.hudong.com%2F68%2F61%2F300000839764127060614318218_950.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1591255747942&di=c2b9015855b04c5a6a62e32784a553f4&imgtype=0&src=http%3A%2F%2Fimg2.imgtn.bdimg.com%2Fit%2Fu%3D3984473917%2C238095211%26fm%3D214%26gp%3D0.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1591255544959&di=5aa04a6a54ef3c5e99c513dbd6bc1f14&imgtype=0&src=http%3A%2F%2Fa0.att.hudong.com%2F27%2F10%2F01300000324235124757108108752.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1591255544959&di=a0255473a4c4cfc138ed6967f095a7a0&imgtype=0&src=http%3A%2F%2Fa0.att.hudong.com%2F56%2F12%2F01300000164151121576126282411.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1591255544958&di=0b1ff613d97f432dfb23da88bd2b715e&imgtype=0&src=http%3A%2F%2Ffile02.16sucai.com%2Fd%2Ffile%2F2014%2F0617%2Fbe2f5973a60156df0c6aeb2aace791c6.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1591255544958&di=289c4ff80a5ca8fac827b51df0d11020&imgtype=0&src=http%3A%2F%2Fa4.att.hudong.com%2F52%2F52%2F01200000169026136208529565374.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1591255544960&di=24fc9da6996c25fce11ac8640f6b1908&imgtype=0&src=http%3A%2F%2Fa3.att.hudong.com%2F14%2F75%2F01300000164186121366756803686.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1591255544960&di=f7d52a2602ea9428542ce468bce762fe&imgtype=0&src=http%3A%2F%2Fa2.att.hudong.com%2F36%2F48%2F19300001357258133412489354717.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1591255544959&di=a05c16984231c7a18c3b838d6663bddd&imgtype=0&src=http%3A%2F%2Fa0.att.hudong.com%2F64%2F76%2F20300001349415131407760417677.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1591255544959&di=af15bfaf0672e2f496ec361e182cfc4f&imgtype=0&src=http%3A%2F%2Fa3.att.hudong.com%2F68%2F61%2F300000839764127060614318218_950.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1591255747942&di=c2b9015855b04c5a6a62e32784a553f4&imgtype=0&src=http%3A%2F%2Fimg2.imgtn.bdimg.com%2Fit%2Fu%3D3984473917%2C238095211%26fm%3D214%26gp%3D0.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1591255544959&di=5aa04a6a54ef3c5e99c513dbd6bc1f14&imgtype=0&src=http%3A%2F%2Fa0.att.hudong.com%2F27%2F10%2F01300000324235124757108108752.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1591255544959&di=a0255473a4c4cfc138ed6967f095a7a0&imgtype=0&src=http%3A%2F%2Fa0.att.hudong.com%2F56%2F12%2F01300000164151121576126282411.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1591255544958&di=0b1ff613d97f432dfb23da88bd2b715e&imgtype=0&src=http%3A%2F%2Ffile02.16sucai.com%2Fd%2Ffile%2F2014%2F0617%2Fbe2f5973a60156df0c6aeb2aace791c6.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1591255544958&di=289c4ff80a5ca8fac827b51df0d11020&imgtype=0&src=http%3A%2F%2Fa4.att.hudong.com%2F52%2F52%2F01200000169026136208529565374.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1591255544960&di=24fc9da6996c25fce11ac8640f6b1908&imgtype=0&src=http%3A%2F%2Fa3.att.hudong.com%2F14%2F75%2F01300000164186121366756803686.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1591255544960&di=f7d52a2602ea9428542ce468bce762fe&imgtype=0&src=http%3A%2F%2Fa2.att.hudong.com%2F36%2F48%2F19300001357258133412489354717.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1591255544959&di=a05c16984231c7a18c3b838d6663bddd&imgtype=0&src=http%3A%2F%2Fa0.att.hudong.com%2F64%2F76%2F20300001349415131407760417677.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1591255544959&di=af15bfaf0672e2f496ec361e182cfc4f&imgtype=0&src=http%3A%2F%2Fa3.att.hudong.com%2F68%2F61%2F300000839764127060614318218_950.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1591255747942&di=c2b9015855b04c5a6a62e32784a553f4&imgtype=0&src=http%3A%2F%2Fimg2.imgtn.bdimg.com%2Fit%2Fu%3D3984473917%2C238095211%26fm%3D214%26gp%3D0.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1591255544959&di=5aa04a6a54ef3c5e99c513dbd6bc1f14&imgtype=0&src=http%3A%2F%2Fa0.att.hudong.com%2F27%2F10%2F01300000324235124757108108752.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1591255544959&di=a0255473a4c4cfc138ed6967f095a7a0&imgtype=0&src=http%3A%2F%2Fa0.att.hudong.com%2F56%2F12%2F01300000164151121576126282411.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1591255544958&di=0b1ff613d97f432dfb23da88bd2b715e&imgtype=0&src=http%3A%2F%2Ffile02.16sucai.com%2Fd%2Ffile%2F2014%2F0617%2Fbe2f5973a60156df0c6aeb2aace791c6.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1591255544958&di=289c4ff80a5ca8fac827b51df0d11020&imgtype=0&src=http%3A%2F%2Fa4.att.hudong.com%2F52%2F52%2F01200000169026136208529565374.jpg",
    };
}
