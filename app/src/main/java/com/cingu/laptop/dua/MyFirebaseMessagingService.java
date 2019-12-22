package com.cingu.laptop.dua;

public class MyFirebaseMessagingService{
//    private int NOTIFICATION_ID=0;
//    private String chanel_id="my_chanel_id";
//
//
//    @Override
//    public void onMessageReceived(RemoteMessage remoteMessage) {
//        super.onMessageReceived(remoteMessage);
//        if(remoteMessage.getData().isEmpty()){
//            generateNotification(remoteMessage.getNotification().getBody(),remoteMessage.getNotification().getTitle());
//        }
//        else{
//            Map<String,String> data=remoteMessage.getData();
//            String title = data.get("title");
//            String body = data.get("message");
//            generateNotification(body,title);
//        }
//
//    }
//
//    private void generateNotification(String body,String title) {
//        Intent intent = new Intent(this, MainActivity.class);
//        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//
//        PendingIntent pendingIntent = PendingIntent.getActivity(this,0,intent, PendingIntent.FLAG_ONE_SHOT);
//        Uri defaultSoundUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
//
//        NotificationCompat.Builder mNotificationBuilder = new NotificationCompat.Builder(this,chanel_id)
//                .setContentText(body)
//                .setContentTitle(title)
//                .setSmallIcon(R.mipmap.ic_launcher)
//                .setPriority(android.app.Notification.PRIORITY_HIGH)
//                .setSound(defaultSoundUri)
//                .setContentIntent(pendingIntent);
//
//        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
//        notificationManager.notify(NOTIFICATION_ID, mNotificationBuilder.build());
//    }
}
